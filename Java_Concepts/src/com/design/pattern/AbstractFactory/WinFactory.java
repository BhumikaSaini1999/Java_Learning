package com.design.pattern.AbstractFactory;

public class WinFactory implements IFactory{

	@Override
	public IButton createButton() {
		// TODO Auto-generated method stub
		return new WinButton();
	}

	@Override
	public ITextBox createTextBox() {
		// TODO Auto-generated method stub
		return new WinTextbox();
	}

}
