package net.kangkang.todolist.model;

import java.util.Date;

public interface ITodoItem {
    // TODO: 2023/2/8 create todo item interface

    String getContent();
    void setContent(String content);
    boolean isDone();
    void done();
    void undone();
}
