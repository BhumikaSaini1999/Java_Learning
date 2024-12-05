package com.multithreading;

public class ChildThread implements Runnable{
	static Thread mainThread;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			mainThread.join(); //child thread calling join on main thread to execute main thread completely first
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0; i<10; i++) {
			System.out.println(Thread.currentThread().getName()+" running..."+i);
		}
	}
	
}
