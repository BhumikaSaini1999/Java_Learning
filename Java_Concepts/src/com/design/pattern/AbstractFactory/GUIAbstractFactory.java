package com.design.pattern.AbstractFactory;

public class GUIAbstractFactory {
	public static IFactory createFactory(String osType) {
		if(osType.equalsIgnoreCase("windows"))
			return new WinFactory();
		else if(osType.equalsIgnoreCase("mac"))
			return new MacFactory();
		else
			return null;
	}
}
