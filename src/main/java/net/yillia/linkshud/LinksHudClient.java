package net.yillia.linkshud;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.yillia.linkshud.client.TemperatureHudOverlay;

public class LinksHudClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        HudRenderCallback.EVENT.register(new TemperatureHudOverlay());
    }
}
