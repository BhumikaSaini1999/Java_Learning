package com.design.pattern.Builder;

public class DesktopDirector {
	private DesktopBuilder desktopBuilder;
	
	public DesktopDirector(DesktopBuilder desktopBuilder) {
		this.desktopBuilder = desktopBuilder;
	}
	
	//Director is actually calling the build process 
	//providing a sequence or way to build the product Desktop
	Desktop buildDesktop() {
		desktopBuilder.buildMonitor();
		desktopBuilder.buildMouse();
		desktopBuilder.buildRam();
		desktopBuilder.buildProcessor();
		desktopBuilder.buildKeyboard();
		desktopBuilder.buildSpeaker();
		desktopBuilder.buildMotherBoard();
		return desktopBuilder.getDesktop();
	}
	
	//Director using builder to get the product Desktop
	//some people write separate method to get Desktop
//	Desktop getDesktop() {
//		return desktopBuilder.getDesktop();
//	}
}
