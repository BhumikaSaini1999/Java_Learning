package com.design.pattern.Builder;

public class Desktop {
	
	String monitor;
	String keyboard;
	String mouse;
	String speaker;
	String ram;
	String processor;
	String motherboard;
	
	public void setMonitor(String monitor) {
		this.monitor = monitor;
	}
	public void setKeyboard(String keyboard) {
		this.keyboard = keyboard;
	}
	
	public void setMouse(String mouse) {
		this.mouse = mouse;
	}
	
	public void setSpeaker(String speaker) {
		this.speaker = speaker;
	}
	
	public void setRam(String ram) {
		this.ram = ram;
	}
	
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	
	public void setMotherboard(String motherboard) {
		this.motherboard = motherboard;
	}
	

	public String showSpecs() {
		return "Desktop [monitor=" + monitor + ", keyboard=" + keyboard + ", mouse=" + mouse + ", speaker=" + speaker
				+ ", ram=" + ram + ", processor=" + processor + ", motherboard=" + motherboard + "]";
	}
	
	
}
