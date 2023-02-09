package net.kangkang.todolist;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import net.fabricmc.api.ModInitializer;
import net.kangkang.todolist.config.TodolistConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TodolistMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("todolist");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		// Only choose one of these!
		AutoConfig.register(TodolistConfig.class, GsonConfigSerializer::new);
		LOGGER.info("Todolist done!");
		// TODO: 2023/2/8 Register commands
	}


}
