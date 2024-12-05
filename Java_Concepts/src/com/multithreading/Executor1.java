package com.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task1 extends Thread {
	public void run() {
		System.out.println("\n Task1 started");

		for (int i = 101; i <= 199; i++) {
			System.out.print(i + " ");
		}

		System.out.println("\n Task1 Done");
	}
}

class Task2 implements Runnable {
	@Override
	public void run() {
		System.out.println("\n Task2 started");

		for (int i = 101; i <= 199; i++) {
			System.out.print(i + " ");
		}

		System.out.println("\n Task2 Done");
	}
}

public class Executor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// execute only 1 thread at a time
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		executorService.execute(new Task1());
		executorService.execute(new Task2());

		System.out.println("\n Task3 started");
		for (int i = 101; i <= 199; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n Task3 Done");
		
		executorService.shutdown();
	}

}
