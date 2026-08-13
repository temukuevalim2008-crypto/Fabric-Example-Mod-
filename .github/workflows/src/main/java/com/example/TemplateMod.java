package net.fabricmc.example;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;

public class TemplateMod implements ModInitializer {
    // Создаем экземпляр твоей панельки TargetHUD
    private static final TargetHud targetHud = new TargetHud();

    @Override
    public void onInitialize() {
        // Подключаем худ к экрану отрисовки Майнкрафта
        HudRenderCallback.EVENT.register((guiGraphics, tickCounter) -> {
            targetHud.render();
        });
    }
}
