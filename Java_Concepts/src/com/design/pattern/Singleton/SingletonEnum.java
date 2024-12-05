package com.design.pattern.Singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

//https://www.geeksforgeeks.org/enum-in-java/
//Reflection Issue => we can resolve using ENUM
enum EnumSingleton{
	INSTANCE;
	
	private EnumSingleton() {
		// TODO Auto-generated constructor stub
		System.out.println("EnumSingleton constructor called");
	}

	public EnumSingleton getInstance() {
		return INSTANCE;
	}
}

public class SingletonEnum{
	public static void main(String args[])  {
		EnumSingleton obj1 = EnumSingleton.INSTANCE.getInstance();
		EnumSingleton obj2 = EnumSingleton.INSTANCE.getInstance();

		System.out.println(obj1+" "+obj2);
		System.out.println(obj1.hashCode()+" "+obj2.hashCode());
		
	}
}
