package net.kangkang.todolist.model;

import java.util.List;

public interface ITodoList {
    String getName();
    void setName(String name);
    String getId();
    List<ITodoItem> getTodoItems();
    void setTodoItems(List<ITodoItem> todoItems);
    ITodoItem getTodoItemByIndex(int index);
    ITodoItem getTodoItemById(String uuid);
    void addTodoItem(ITodoItem todoItem);
    void removeTodoItemByIndex(int index);
    void removeTodoItemById(String uuid);
    boolean isAllDone();
    // TODO: 2023/2/8 create todo list interface 
}
