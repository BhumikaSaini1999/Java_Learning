package com.multithreading;

import java.util.LinkedList;
import java.util.Queue;

//Producer Consumer Problem

public class BlockingQueue {
	private Queue<Integer> q;
	private int capacity;
	
	public BlockingQueue(int cap) {
		q = new LinkedList<>();
		capacity = cap;
	}
	
	public boolean add(int item) {
		synchronized(q) {
			
			//don't use if here-> while loop will handle the case for multiple adder threads waiting at the same time
			while(q.size()==capacity) {
				try {
					q.wait(); // if let's suppose queue is already full and adder thread trying to add more data into queue
					//so at this time adder thread has to wait until the other remove thread removes the data from queue
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			q.add(item);
			q.notifyAll(); //adder thread notifying all waiting threads
			return true;
		}
	}
	
	//Object class has 3 methods -> wait(), notify(), notifyAll()
	//wait()->when thread goes to waiting state, then thread releases the lock, so once the waiting thread is notified then its 
	          //still blocked for lock acquisition and once lock is acquired then only it will go to running state
	//sleep()->when thread goes to sleeping state, then thread do not release the lock, and once time expires it directly jumps to running state
	public int remove() {
       synchronized(q) {
			while(q.size()==0) {
				//if lets suppose at first go a thread goes for remove()-> will wait until another adder thread adds the item
				try {
					q.wait();// here remove thread has to wait
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		   int element = q.poll();
		   q.notifyAll(); //remove thread notifying all waiting threads
		   return element;
		}
	}
}
