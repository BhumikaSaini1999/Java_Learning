package com.design.pattern.Singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

//https://www.geeksforgeeks.org/reflection-in-java/ -> Reflection
//Reflection Issue => we can resolve using ENUM

class EarlyReflection{
	
	private static EarlyReflection instance = new EarlyReflection();

	private EarlyReflection() {
			System.out.println("Singleton EarlyReflection constructor called");
	}

	public static EarlyReflection getSingletonEarlyReflectionInstance() {
		return instance;
	}
}

public class SingletonEarlyReflectionIssue{
	public static void main(String args[])  {
		EarlyReflection obj1 =  EarlyReflection.getSingletonEarlyReflectionInstance();
		EarlyReflection obj2 = null;
		
		Constructor[] constructors = EarlyReflection.class.getDeclaredConstructors();
		
		for(Constructor constructor : constructors) {
			System.out.println("constructor "+ constructor);
			constructor.setAccessible(true);
			try {
				obj2 = (EarlyReflection) constructor.newInstance();
				break;
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(obj1+" "+obj2);
		System.out.println(obj1.hashCode()+" "+obj2.hashCode());
	}
}
