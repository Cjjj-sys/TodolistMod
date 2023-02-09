package net.kangkang.todolist.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import net.kangkang.todolist.TodolistMod;

@Config(name = "todolist")
public
class TodolistConfig implements ConfigData {
    public String[] CurrentTodolist = {"Diamond 1/30", "Bed 0/1","Iron Ingot 256/1024"};
    // TODO: 2023/2/8  Build configs

}