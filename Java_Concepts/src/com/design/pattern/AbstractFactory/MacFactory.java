package com.design.pattern.AbstractFactory;

public class MacFactory implements IFactory{

	@Override
	public IButton createButton() {
		// TODO Auto-generated method stub
		return new MacButton();
	}

	@Override
	public ITextBox createTextBox() {
		// TODO Auto-generated method stub
		return new MacTextbox();
	}

}
