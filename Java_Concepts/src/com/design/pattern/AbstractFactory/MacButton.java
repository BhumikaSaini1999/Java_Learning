package com.design.pattern.AbstractFactory;

public class MacButton implements IButton{

	@Override
	public void getMessage() {
		// TODO Auto-generated method stub
		System.out.println("Thankyou for using MacButton class.");
	}

	@Override
	public void press() {
		// TODO Auto-generated method stub
		System.out.println("MacButton is pressed.");
	}
	
}
