package net.kangkang.todolist.model;

import java.util.UUID;

public class CommonTodoItem implements ITodoItem{
    private String content;
    private final String id;
    private boolean done;

    public CommonTodoItem(String content) {
        this.content = content;
        this.id = UUID.randomUUID().toString();
        this.done = false;
    }

    @Override
    public String getContent() {
        return content;
    }

    @Override
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String getId(){
        return id;
    }

    @Override
    public boolean isDone() {
        return done;
    }

    @Override
    public void done() {
        done = true;
    }

    @Override
    public void undone() {
        done = false;
    }
}
