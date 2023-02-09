package net.kangkang.todolist.model;

public class CommonTodoItem implements ITodoItem{
    private String content;
    private boolean done;

    public CommonTodoItem(String content) {
        this.content = content;
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
    // TODO: 2023/2/8 implement common todo item
}
