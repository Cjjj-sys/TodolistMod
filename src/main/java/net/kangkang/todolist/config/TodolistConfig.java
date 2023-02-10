package net.kangkang.todolist.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import net.kangkang.todolist.TodolistMod;
import net.kangkang.todolist.helper.TestData;
import net.kangkang.todolist.model.CommonTodoItem;
import net.kangkang.todolist.model.CommonTodoList;
import net.kangkang.todolist.model.ITodoItem;
import net.kangkang.todolist.model.ITodoList;

import java.util.ArrayList;
import java.util.List;

@Config(name = "todolist")
public
class TodolistConfig implements ConfigData {
    ITodoList CurrentTodolist = TestData.getTestTodoList();
    // TODO: 2023/2/8  Build configs

}