package com.milhax.mcscreen;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.fabricmc.api.ClientModInitializer;

public class MCSCREEN implements ClientModInitializer {

	public static final String MOD_ID = "mcscreen";
	public static final Logger LOGGER = LogManager.getFormatterLogger(MCSCREEN.MOD_ID);

	@Override
	public void onInitializeClient() {
	}
}