package com.design.pattern.AbstractFactory;

public class Client {
	public static void main(String[] args) {
		IFactory factory = GUIAbstractFactory.createFactory("windows");
		IButton button = factory.createButton();
		button.press();
		button.getMessage();
		
		IFactory factory1 = GUIAbstractFactory.createFactory("mac");
		ITextBox textbox = factory1.createTextBox();
		textbox.showText();
		textbox.getMessage();
	}
}
