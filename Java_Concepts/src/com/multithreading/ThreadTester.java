package com.multithreading;

//main is also a user thread.
//its jvm responsibility to run the threads. 
//program won't terminate until user threads not completely executed.
//Program will terminate once if all user threads get completely executed.

//if apart from user threads, daemon thread is also executing, if user threads completely get executed but still daemon thread running
//then program might terminate (bcoz daemon threads has not given much priority.)

public class ThreadTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main is starting");
		
		//Method1:
		Thread1 thread1 = new Thread1("thread1");
		//thread1.setDaemon(true);
		thread1.start();
		
		//Method2:
		
		//without lambda
		//Thread thread2 = new Thread(new Thread2(), "thread2");
		
		//with lamba
		Thread thread2 = new Thread(()->{
			for(int i=0; i<5; i++) {
				System.out.println("Using lambda "+Thread.currentThread()+" , "+i);
			}
		});
		thread2.start();
		System.out.println("main is exiting");
	}

}
