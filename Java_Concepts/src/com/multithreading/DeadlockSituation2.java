package com.multithreading;

public class DeadlockSituation2 {
	public static void main(String[] args) throws InterruptedException {
		
		ChildThread.mainThread = Thread.currentThread();
		
		Thread childThread = new Thread(new ChildThread());
		childThread.start();
		
		childThread.join();//main thread calling join on child thread to execute child thread completely first
		for(int i=0; i<100; i++) {
			System.out.println(Thread.currentThread().getName()+" running..."+ i);
		}
	}
}
