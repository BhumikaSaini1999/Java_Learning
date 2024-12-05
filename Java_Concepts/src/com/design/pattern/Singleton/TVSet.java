package com.design.pattern.Singleton;

//https://www.javatpoint.com/singleton-design-pattern-in-java
//https://www.geeksforgeeks.org/prevent-singleton-pattern-reflection-serialization-cloning/ Important***



//singleton design pattern-> class can be instantiated only once.
//singleton class can have only one instance, if we try to create more than one instance,
//it will return the same old instance again

//Ist Use case:  One use case for the singleton design pattern is a caching system in a web application. 
//I would use it to create a single instance of a cache manager class that stores and manages cache data for 
//an application. This ensures that all parts of the application have access to the same cache data, 
//which can improve performance by reducing the need for repetitive database queries. It also eliminates 
//inconsistencies. This pattern is an excellent solution for this use case because it provides centralised control 
//over the cache data, reducing complexity and ensuring that the cache data is consistent.

//2nd Use case: In a database-driven application, the singleton design pattern can create a database 
//connection manager that ensures only one connection to the database, rather than multiple connections. 
//This helps to control the number of instances of a class and ensures that only one instance exists 
//throughout the lifetime of an application. This improves the application's performance and stability.

public class TVSet {
	//volatile only ensures visibility not atomicity. common value will be visible across multiple threads,
	//as now value is stored not to the cache but RAM, to prevent from race condition, use synchronized block or method
	private static volatile TVSet tvSetInstance = null;
	
	private TVSet() {
		System.out.println("TV Set instantiated...");
	}
	
	//to ensure this piece of code is not executed by multiple threads, we can make our method synchronized
	//but making the method synchronized is not a good approach because synchronized itself having overhead
	//and only this line is -> return tvSetInstance = new TVSet(); problematic
	//and we want to make this line thread-safe
	
	public static TVSet getTVSetInstance() {
		if(tvSetInstance==null) {
			synchronized(TVSet.class) {//t1,t2 2 threads come here, let's suppose t1 got a chance, so t2 will wait until t1 
				//completes and t1 creates a new object, now t1 releases lock and now t2 will come , so again t2 will create here a new object which would be problematic
				//solution: double checking and making volatile
				if(tvSetInstance==null)//again put this condition
				   tvSetInstance = new TVSet();
			}
		}
		
		return tvSetInstance;
	}
}
