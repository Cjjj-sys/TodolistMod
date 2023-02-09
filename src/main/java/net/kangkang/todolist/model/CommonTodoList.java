package net.kangkang.todolist.model;

import java.util.List;
import java.util.UUID;

public class CommonTodoList implements ITodoList{
    private String name;
    private final String id;
    private List<ITodoItem> todoItems;

    public CommonTodoList(String name, List<ITodoItem> todoItems){
        this.name = name;
        this.id = UUID.randomUUID().toString();
        this.todoItems = todoItems;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public List<ITodoItem> getTodoItems() {
        return todoItems;
    }

    @Override
    public void setTodoItems(List<ITodoItem> todoItems) {
        this.todoItems = todoItems;
    }

    @Override
    public ITodoItem getTodoItemByIndex(int index) {
        return todoItems.get(index);
    }

    @Override
    public ITodoItem getTodoItemById(String uuid) {
        for (ITodoItem todoItem : todoItems) {
            if (todoItem.getId().equals(uuid)) {
                return todoItem;
            }
        }
        return null;
    }

    @Override
    public void addTodoItem(ITodoItem todoItem) {
        todoItems.add(todoItem);
    }

    @Override
    public void removeTodoItemByIndex(int index) {
        todoItems.remove(index);
    }

    @Override
    public void removeTodoItemById(String uuid) {
        int toRemoveIndex = -1;
        for (int i = 0; i < todoItems.size(); i++) {
            if (todoItems.get(i).getId().equals(uuid)){
                toRemoveIndex = i;
            }
        }
        if (toRemoveIndex != -1){
            todoItems.remove(toRemoveIndex);
        }
    }

    @Override
    public boolean isAllDone() {
        boolean allDone = true;
        for (ITodoItem todoItem : todoItems) {
            if (!todoItem.isDone()) {
                allDone = false;
            }
        }
        return allDone;
    }
}
