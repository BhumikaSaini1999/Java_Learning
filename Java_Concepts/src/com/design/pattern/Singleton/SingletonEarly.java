package com.design.pattern.Singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//Singleton Early Instantiation
class Early{
	// Early, instance will be created at load time
	//In such case, we create the instance of the class at the time of declaring the static data member, 
	//so instance of the class is created at the time of classloading.
	private static Early instance = new Early();

	private Early() {
			System.out.println("SingletonEarly constructor called");
		}

	public static Early getSingletonEarlyInstance() {
		return instance;
	}
}

public class SingletonEarly{
	public static void main(String args[]) {
//		Early obj1 = Early.getSingletonEarlyInstance();
//		Early obj2 = Early.getSingletonEarlyInstance();
//		
//		System.out.println(obj1);
//		System.out.println(obj2);
		
		//here its automatically Thread safe
		ExecutorService service = Executors.newFixedThreadPool(2);
		service.execute(()->Early.getSingletonEarlyInstance());
		service.execute(()->Early.getSingletonEarlyInstance());
		service.shutdown();
	}
}
