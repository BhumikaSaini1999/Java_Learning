package com.practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
//Print Alternate Evens from Queue - BlackRock
public class QueuePrinting {

	Queue<Integer> q;
	boolean isFirstThreadTurn = true;

	public QueuePrinting() {
		q = new LinkedList<>();
		for (int i = 1; i <= 20; i++) {
			q.add(i);
		}
	}

	public void printIstEven() {
		while (!q.isEmpty()) {
			synchronized (this) {
				while (!isFirstThreadTurn)
					try {
						this.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				while (!q.isEmpty() && q.peek() % 2 != 0) {// remove all odd numbers
					q.poll();
				}

				if (!q.isEmpty()) {
					System.out.println(Thread.currentThread().getName() + " " + q.poll());
					isFirstThreadTurn = false;
					this.notify();
				}
			}
		}
	}

	public void print2ndEven() {
		while (!q.isEmpty()) {
			synchronized (this) {
				while (isFirstThreadTurn)
					try {
						this.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				while (!q.isEmpty() && q.peek() % 2 != 0) {// remove all odd numbers
					q.poll();
				}

				if (!q.isEmpty()) {
					System.out.println(Thread.currentThread().getName() + " " + q.poll());
					isFirstThreadTurn = true;
					this.notify();
				}
			}
		}
	}

	public static void main(String[] args) {
		QueuePrinting obj = new QueuePrinting();
		ExecutorService service = Executors.newFixedThreadPool(2);

		service.execute(() -> {
			Thread.currentThread().setName("Even1");
			obj.printIstEven();
		});

		service.execute(() -> {
			Thread.currentThread().setName("Even2");
			obj.print2ndEven();
		});

		service.shutdown();
	}

}
