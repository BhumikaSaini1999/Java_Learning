package com.multithreading;

public class ThreadJoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main thread starting");
		
		Thread childThread = new Thread(()->{
			for(int i=0; i<10; i++) {
				System.out.println(Thread.currentThread().getName()+" running");
			}
		}, "child thread");
		
		childThread.start();
		
		try {
			childThread.join(); //main thread calling join on child thread, so that child thread will first completely execute 
			//and till this time main thread will go to waiting state until child thread execution
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main thread exiting");
	}

}
