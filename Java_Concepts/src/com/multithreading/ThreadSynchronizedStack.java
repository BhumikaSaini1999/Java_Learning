package com.multithreading;

public class ThreadSynchronizedStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main is starting");
		
		Stack stack = new Stack(5);
		
		//pusher thread
		new Thread(()->{
			int counter = 0;
			while(++counter<10) {
					try {
						System.out.println("Pushed: "+stack.push(100));
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
		}, "pusher").start();
		
		//popper thread
		new Thread(()->{
			int counter = 0;
			while(++counter<10) {
					try {
						System.out.println("Popped: "+stack.pop());
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
		}, "popper").start();
		
		System.out.println("main is exiting");
	}

}
