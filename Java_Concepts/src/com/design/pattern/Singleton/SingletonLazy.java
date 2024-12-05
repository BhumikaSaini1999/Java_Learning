package com.design.pattern.Singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//Singleton Lazy Instantiation
class Lazy{
	//In such case, we create the instance of the class in synchronized method or synchronized block, 
	//so instance of the class is created when required.
	private static Lazy instance;

	private Lazy() {
			System.out.println("SingletonLazy constructor called");
	}

	public static Lazy getSingletonLazyInstance() {
		if(instance==null) {
			synchronized(Lazy.class){
				if(instance==null)
				   instance = new Lazy();
			}
		}
		
		return instance;
	}
}

public class SingletonLazy{
	public static void main(String args[]) {
//		Lazy obj1 = Lazy.getSingletonLazyInstance();
//		Lazy obj2 = Lazy.getSingletonLazyInstance();
//		
//		System.out.println(obj1);
//		System.out.println(obj2);
		
		ExecutorService service = Executors.newFixedThreadPool(2);
		service.execute(()->Lazy.getSingletonLazyInstance());
		service.execute(()->Lazy.getSingletonLazyInstance());
		service.shutdown();
	}
}
