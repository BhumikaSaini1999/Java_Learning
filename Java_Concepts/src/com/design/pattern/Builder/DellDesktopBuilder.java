package com.design.pattern.Builder;

public class DellDesktopBuilder extends DesktopBuilder{

	@Override
	void buildMonitor() {
		// TODO Auto-generated method stub
		desktop.setMonitor("Dell Monitor");
	}

	@Override
	void buildKeyboard() {
		// TODO Auto-generated method stub
		desktop.setKeyboard("Dell keyboard");
	}

	@Override
	void buildMouse() {
		// TODO Auto-generated method stub
		desktop.setMouse("Dell Mouse");
	}

	@Override
	void buildSpeaker() {
		// TODO Auto-generated method stub
		desktop.setSpeaker("Dell Speaker");
	}

	@Override
	void buildRam() {
		// TODO Auto-generated method stub
		desktop.setRam("Dell RAM");
	}

	@Override
	void buildProcessor() {
		// TODO Auto-generated method stub
		desktop.setProcessor("Dell Processor");
	}

	@Override
	void buildMotherBoard() {
		// TODO Auto-generated method stub
		desktop.setMotherboard("Dell Motherboard");
	}

}
