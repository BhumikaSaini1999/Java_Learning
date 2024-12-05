package com.multithreading;

public class Thread1 extends Thread{
	
	public Thread1(String threadName) {
		// TODO Auto-generated constructor stub
		super(threadName);
	}

	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			//Thread.currentThread()-> will print->[thread1,5,main]//child thread name, thread priority, parent thread name
			System.out.println("Inside "+Thread.currentThread()+" "+i);
		}
	}
}
