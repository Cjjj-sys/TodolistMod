package net.kangkang.todolist.helper;

import net.fabricmc.fabric.impl.itemgroup.MinecraftItemGroups;
import net.kangkang.todolist.model.*;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.mob.ZombieEntity;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.MinecartItem;

import java.util.ArrayList;
import java.util.List;

public class TestData {
    public static CommonTodoList getTestTodoList() {
        List<ITodoItem> todoItems = new ArrayList<ITodoItem>();
        todoItems.add(new CommonTodoItem("Test common"));
        todoItems.add(new GetItemTodoItem("Get a diamond", Items.DIAMOND.asItem(), 1, false));
        todoItems.add(new KillMobTodoItem("Kill a zombie", EntityType.ZOMBIE, 1, false));
        return new CommonTodoList("Example", todoItems);
    }
}
