package com.design.pattern.Builder;

public class HPDesktopBuilder extends DesktopBuilder{

	@Override
	void buildMonitor() {
		// TODO Auto-generated method stub
		desktop.setMonitor("HP Monitor");
	}

	@Override
	void buildKeyboard() {
		// TODO Auto-generated method stub
		desktop.setKeyboard("HP keyboard");
	}

	@Override
	void buildMouse() {
		// TODO Auto-generated method stub
		desktop.setMouse("HP Mouse");
	}

	@Override
	void buildSpeaker() {
		// TODO Auto-generated method stub
		desktop.setSpeaker("HP Speaker");
	}

	@Override
	void buildRam() {
		// TODO Auto-generated method stub
		desktop.setRam("HP RAM");
	}

	@Override
	void buildProcessor() {
		// TODO Auto-generated method stub
		desktop.setProcessor("HP Processor");
	}

	@Override
	void buildMotherBoard() {
		// TODO Auto-generated method stub
		desktop.setMotherboard("HP Motherboard");
	}

}
