package com.design.pattern.AbstractFactory;

public class MacTextbox implements ITextBox{

	@Override
	public void getMessage() {
		// TODO Auto-generated method stub
		System.out.println("Thankyou for using MacTextbox class.");
	}

	@Override
	public void showText() {
		// TODO Auto-generated method stub
		System.out.println("MacTextbox displaying text.");
	}

}
