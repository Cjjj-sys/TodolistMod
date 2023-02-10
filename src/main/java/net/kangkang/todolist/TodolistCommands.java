package net.kangkang.todolist;

import com.mojang.brigadier.Command;
import com.mojang.brigadier.CommandDispatcher;
import me.shedaniel.autoconfig.AutoConfig;

import static com.mojang.brigadier.arguments.StringArgumentType.*;
import static net.fabricmc.fabric.api.client.command.v2.ClientCommandManager.*;

import net.fabricmc.fabric.api.client.command.v2.FabricClientCommandSource;
import net.kangkang.todolist.config.TodolistConfig;
import net.minecraft.command.CommandSource;
import net.minecraft.command.argument.ColorArgumentType;

public class TodolistCommands {
    public static TodolistConfig config;
    // TODO: 2023/2/8 add /todolist , /todolist list , /todolist remove etc.
    public static void registerCommands() {
        if(config == null) {
            config = AutoConfig.getConfigHolder(TodolistConfig.class).getConfig();
        }


    }

    public static void register(CommandDispatcher<FabricClientCommandSource> dispatcher){
        dispatcher.register(literal("todolist")
                .requires(source -> source.hasPermissionLevel(2)) // Must be a game master to use the command. Command will not show up in tab completion or execute to non operators or any operator that is permission level 1.
                .then(argument("list", ColorArgumentType.color())
                        .then(argument("message", greedyString())
                                .executes(ctx -> listTodoLists(ctx.getSource()))))); // You can deal with the arguments out here and pipe them into the command.
    }

    public static int listTodoLists(CommandSource ctx){

        return Command.SINGLE_SUCCESS;
    }
}