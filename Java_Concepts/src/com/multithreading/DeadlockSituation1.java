package com.multithreading;

//in order to prevent the deadlock situation, always acquire the locks 
//in the same order for all threads
public class DeadlockSituation1 {
	public static void main(String[] args) {
		
		String lock1 = "bhumika";
		String lock2 = "saini";
		
		Thread thread1 = new Thread(()->{
			synchronized(lock1) {
				try {
					Thread.sleep(1);
					
					synchronized(lock2) {
						System.out.println("lock2 acquired");
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		},"thread1");
		
		Thread thread2 = new Thread(()->{
			synchronized(lock2) {
				try {
					Thread.sleep(1);
					
					synchronized(lock1) {
						System.out.println("lock1 acquired");
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		},"thread2");
		
		thread1.start();
		thread2.start();
		
		while(true) {
			Thread.State state = thread1.getState();
			System.out.println(state);
			if(state == Thread.State.TERMINATED)
				break;
		}
	}
}
