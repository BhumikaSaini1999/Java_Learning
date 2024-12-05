package com.multithreading;

//This class is not thread-safe. if we run it in single threaded env, it will work perfectly fine
// but for multi threaded environment, this class will throw error 


//2 ways: synchronized method or synchronized block
//synchronized method-> we do not need to pass explicitly lock object here, it uses implicit lock, it basically wraps the entire
//      block of code with synchronized(this)-> so if there are 5 synchronized methods, then only 1 thread can execute 1 method at a time because all threads sharing the same this lock 

//synchronized block-> user must explicitly pass lock object here, 
//      we are passing here lock object-> we can pass any object as a lock (primitives not allowed -> although Wrapper class objects allowed)
// in this case, if we have 5 methods, inside every method for synchronized block if we are defining different lock for each method
//within synchronized block then multiple threads can work parallely but only 1 thread allowed for 1 block.

//to synchronize static method-> class level lock is required, lock would be classname.class

public class Stack {
	private int[] array;
	private int stackTop;
	Object lock;
	
	public Stack(int capacity) {
		array = new int[capacity];
		stackTop = -1;
		lock = new Object();
	}
	
	//These two synchronized blocks are bounded by the same lock, lets suppose we have t1,t2,t3 threads
	//if t1 is executing push() , then no other thread can execute push() as well as pop() because both methods
	//are bounded by the same lock
	
	//here both push() pop() having different locks won't solve data inconsistency problem.
	//Because in that case we are allowing thread2 to execute pop() as well parallely to push() which is executed by thread1.
	public boolean push(int element) throws InterruptedException{
		synchronized(lock) {
//			if(isFull())
//				return false;
			
			while(isFull())
				lock.wait();
				
			++stackTop;
			
//			try {
//				//Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			
			array[stackTop] = element;
			lock.notify();
			return true;
		}
	}
	
	public int pop() throws InterruptedException {
		synchronized(lock) {
//			if(isEmpty())
//				return Integer.MIN_VALUE;
//			
			while(isEmpty())
				lock.wait();
			
			int obj = array[stackTop];
			array[stackTop] = Integer.MIN_VALUE;
			
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			
			stackTop--;
			lock.notify();
			return obj;
		}
	}
	
	public boolean isEmpty() {
		return stackTop < 0;
	}
	
	public boolean isFull() {
		return stackTop >= array.length-1;
	}
}
