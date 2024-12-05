package com.design.pattern.Singleton;

import java.io.Serializable;

public class Singleton{
	
	private static Singleton singletonInstance = null;
	
	private Singleton() {
		System.out.println("Singleton class constructor called");
	}
	
	public synchronized static Singleton getSingletonInstance() {
		//synchronized(Singleton.class) {
			if(singletonInstance==null) {
				singletonInstance = new Singleton();
		    }			
		//}
		return singletonInstance;
	}
}
