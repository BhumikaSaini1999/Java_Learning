package com.design.pattern.Builder;

public abstract class DesktopBuilder {
	protected Desktop desktop;//would be used by all the classes extending DesktopBuilder
	
	public DesktopBuilder() {
		desktop = new Desktop();
	}
	
	abstract void buildMonitor();
	abstract void buildKeyboard();
	abstract void buildMouse();
	abstract void buildSpeaker();
	abstract void buildRam();
	abstract void buildProcessor();
	abstract void buildMotherBoard();
	
	Desktop getDesktop() {
		return desktop;
	}
}
