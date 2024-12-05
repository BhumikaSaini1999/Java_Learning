package com.design.pattern.AbstractFactory;

public class WinTextbox implements ITextBox{

	@Override
	public void getMessage() {
		// TODO Auto-generated method stub
		System.out.println("Thankyou for using WinTextbox class.");
	}

	@Override
	public void showText() {
		// TODO Auto-generated method stub
		System.out.println("WinTextbox displaying text");
	}

}
