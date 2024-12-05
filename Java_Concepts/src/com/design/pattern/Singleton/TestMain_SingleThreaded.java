package com.design.pattern.Singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestMain_SingleThreaded {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
//		Singleton obj1 = Singleton.getSingletonInstance();
//		System.out.println(obj1);
//		
//		Singleton obj2 = Singleton.getSingletonInstance();
//		System.out.println(obj2);
		
		
		//Multithreading - Thread safe
		ExecutorService service = Executors.newFixedThreadPool(2);
		service.execute(()->Singleton.getSingletonInstance());
		service.execute(()->Singleton.getSingletonInstance());
		service.shutdown();
		
		
		
	}

}
