package net.kangkang.todolist.mixin;

import me.shedaniel.autoconfig.AutoConfig;
import net.kangkang.todolist.TodolistCommands;
import net.kangkang.todolist.config.TodolistConfig;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.OrderedText;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.awt.*;

@Mixin(InGameHud.class)
public class InGameHudMixin {
    @Shadow @Final private MinecraftClient client;
    @Inject(at = @At("TAIL"), method = "render")
    public void render(MatrixStack matrices, float tickDelta, CallbackInfo ci) {
        MinecraftClient client = MinecraftClient.getInstance();

//        matrices.push();
//        String todolistStr = "Todolist\n";
//        for (var todo:
//                AutoConfig.getConfigHolder(TodolistConfig.class).getConfig().CurrentTodolist) {
//            todolistStr += todo + "\n";
//        }
//        client.textRenderer.draw(matrices, todolistStr, 0.0f, (float)client.getWindow().getHeight() / 3, Color.WHITE.getRGB());
//        matrices.pop();
        // TODO: 2023/2/8 feature: show todolist on hud
    }
}
