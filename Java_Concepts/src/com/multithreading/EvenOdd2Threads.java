package com.multithreading;

class EvenOdd {
	private final Object lock = new Object();
	boolean evenFlag=false;
	
	public void EvenPrint() throws InterruptedException {
		
		for (int i = 2; i <= 20; i+=2) {
			synchronized(lock) {
				
				while(!evenFlag) {//condition to wait
					lock.wait();
				}
				
				System.out.println("Even Thread: " + i);
				evenFlag=false;  
				lock.notifyAll();
			}
		}
		
	}

	public void OddPrint() throws InterruptedException {
		
		for (int i = 1; i <= 20; i+=2) {
			synchronized (lock) {
				
				while(evenFlag) {//condition to wait
					lock.wait();
				}
				
				System.out.println("Odd Thread: " + i);
				evenFlag=true;
				
				lock.notifyAll();
			}
		}
		
	}
}

public class EvenOdd2Threads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenOdd printNumbers = new EvenOdd();
		new Thread(() -> {
			try {
				printNumbers.OddPrint();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}, "oddThread").start();
		
		new Thread(() -> {
			try {
				printNumbers.EvenPrint();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}, "evenThread").start();
	}
}
