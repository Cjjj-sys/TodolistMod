package net.kangkang.todolist.model;

import net.minecraft.item.Item;

import java.util.UUID;

public class GetItemTodoItem implements ITodoItem{
    private final long total;
    private final Item item;
    private long progress;
    private boolean preserveProgress;
    private String content;
    private final String id;
    private boolean done;
    public GetItemTodoItem(String content, Item item, long total, boolean preserveProgress){
        this.content = content;
        this.id = UUID.randomUUID().toString();
        this.item = item;
        this.total = total;
        this.progress = 0;
        this.preserveProgress = preserveProgress;
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
    public String getId() {
        return id;
    }

    public long getTotal(){
        return total;
    }

    public long getProgress(){
        return progress;
    }

    public Item getItem(){
        return item;
    }

    public boolean isPreserveProgress(){
        return  preserveProgress;
    }

    public void setPreserveProgress(boolean preserveProgress){
        this.preserveProgress = preserveProgress;
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

    /**
     * check if the progress has reached the total
     */
    public boolean canDone(){
        return progress >= total;
    }

    public void updateProgress(long progress) {
        if (preserveProgress) {
            if (progress > this.progress) {
                this.progress = progress;
            }
        }
        else{
            this.progress = progress;
        }
    }
}
