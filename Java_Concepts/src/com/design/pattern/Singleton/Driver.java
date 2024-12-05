package com.design.pattern.Singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//To run TVSet class in multi-threaded environment
		ExecutorService executor = Executors.newFixedThreadPool(2);
		
		//2 threads
		executor.execute(()->TVSet.getTVSetInstance());
		executor.execute(()->TVSet.getTVSetInstance());
		executor.execute(()->TVSet.getTVSetInstance());
		executor.execute(()->TVSet.getTVSetInstance());
		executor.execute(()->TVSet.getTVSetInstance());
		executor.execute(()->TVSet.getTVSetInstance());
		executor.execute(()->TVSet.getTVSetInstance());
		executor.execute(()->TVSet.getTVSetInstance());
		executor.execute(()->TVSet.getTVSetInstance());
		executor.execute(()->TVSet.getTVSetInstance());
		executor.execute(()->TVSet.getTVSetInstance());
		executor.execute(()->TVSet.getTVSetInstance());
		executor.execute(()->TVSet.getTVSetInstance());
		
		executor.shutdown();
	}

}
