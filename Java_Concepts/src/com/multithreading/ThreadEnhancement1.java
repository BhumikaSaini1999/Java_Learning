package com.multithreading;

public class ThreadEnhancement1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
		
		//creates a new ThreadGroup with specified group name and it will be 
		//child group of main Group
		ThreadGroup g1 = new ThreadGroup("myFirstGroup");
		System.out.println(g1.getParent().getName()); //main
		System.out.println(g1.getName()); //myFirstGroup
		
		//creates a new ThreadGroup with specified group name and it will be child group of 
		//specified parent Group as first parameter
		ThreadGroup g2 = new ThreadGroup(g1, "mySecondGroup");
		System.out.println(g2.getParent().getName()); //myFirstGroup
		System.out.println(g2.getName()); //mySecondGroup
		System.out.println(g2.getMaxPriority());
	}

}
