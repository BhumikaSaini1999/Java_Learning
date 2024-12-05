package com.concurrency;

import java.util.ArrayList;

//ArrayList in Java is not thread-safe because it is not synchronized, meaning that 
//multiple threads can access and modify the internal structure of the ArrayList concurrently 
//without any form of coordination. This lack of synchronization can lead to data inconsistency, 
//race conditions, and unexpected behavior.

//Expected Behavior:
//If ArrayList were thread-safe, the size of the list should be exactly 2000 after
//both threads finish execution, because each thread adds 1000 elements.

//Possible Actual Outcome:
//However, due to the lack of thread safety, you might observe the following issues:
//1.) Data Corruption: The internal structure of the ArrayList (e.g., the array holding the elements) might be corrupted 
                   //because one thread could modify the array while another thread is reading or writing to it.
//2.) Race Conditions: Multiple threads could try to add elements at the same index, leading to overwriting or skipping elements.
//3.) Inconsistent Size: The final size of the list might not be 2000. It could be less due to race conditions where some additions are lost.


//Explanation:
//When multiple threads attempt to modify the ArrayList simultaneously, they might interfere with each other's operations. 
//For example, when the internal array needs to grow (because it's full), one thread might start resizing the array while another thread is trying to add an element. This can lead to situations where:
//The new element is lost.
//The list's size doesn't correctly reflect the number of elements.
//The internal array's state is corrupted.

public class ArrayListConcurrency {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();

		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 1000; i++)
				list.add(i);
		}, "adder");

		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 1000; i++)
				list.add(i);
		}, "adder");

		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		System.out.println(list.size());

	}

}
