package com.multithreading;

public class ThreadStates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread1 = new Thread(()->{
			try {
				Thread.sleep(1);
				
				for(int i=10000; i>0; i--);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}, "States");
		
		thread1.start();
		
		while(true) {
			Thread.State state = thread1.getState();
			System.out.println(state);
			if(state == Thread.State.TERMINATED)
				break;
		}
	}

}
