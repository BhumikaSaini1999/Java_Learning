package com.design.pattern.AbstractFactory;

public class WinButton implements IButton{

	@Override
	public void getMessage() {
		// TODO Auto-generated method stub
		System.out.println("Thankyou for using WinButton class.");

	}

	@Override
	public void press() {
		// TODO Auto-generated method stub
		System.out.println("WinButton is pressed.");
	}

}
