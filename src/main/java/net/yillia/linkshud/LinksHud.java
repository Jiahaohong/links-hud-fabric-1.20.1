package net.yillia.linkshud;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class LinksHud implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("linkshud");
	private static final String MOD_ID = "linkshud";

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}
}