package com.practice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EvenOdd {
	boolean evenFlag=false;
	
	public void printEven() {
		for(int i=2; i<=20; i+=2) {
			synchronized(this) {
				try {
					while(!evenFlag)
					    this.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+" "+i);
				evenFlag=false;
				this.notify();
			}
		}
	}
	
    public void printOdd() {
    	for(int i=1; i<=20; i+=2) {
    		synchronized(this) {
    			try {
    				while(evenFlag)
					     this.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+" "+i);
				evenFlag=true;
				this.notify();
			}
		}
	}
    
    public static void main(String[] args) {
    	ExecutorService service = Executors.newFixedThreadPool(2);
    	EvenOdd obj = new EvenOdd();
    	service.execute(()->{
    		Thread.currentThread().setName("Even Thread");
    		obj.printEven();
    	});
    	
    	service.execute(()->{
    		Thread.currentThread().setName("Odd Thread");
    		obj.printOdd();
    	});
    	
    	service.shutdown();
    }
}
