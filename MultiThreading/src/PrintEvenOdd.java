//Using Reentrant Lock

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class PrintEvenOdd {
	ReentrantLock l = new ReentrantLock();
	Condition even = l.newCondition();
	Condition odd = l.newCondition();
	int MAX_COUNT = 40;
	int i=1;

	public void printNumbers() {
		while(i<=MAX_COUNT) {
			l.lock();
			try {
				if (i % 2 == 1 && Thread.currentThread().getName().equals("Even Thread"))
					even.await(); //even will go to wait state
				else if (i % 2 == 0 && Thread.currentThread().getName().equals("Odd Thread"))
					odd.await(); //odd will go to wait state
				else {
					System.out.println(Thread.currentThread().getName() + " " + i);

					if (i % 2 == 1)//when odd number is printed, even will be in waiting state, so signaling even thread(notify)
						even.signal();
					else //when even number is printed, odd will be in waiting state, so signaling odd thread(notify)
						odd.signal();
					i+=1;
				}
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			finally {
				l.unlock();
			}
		}
	}

	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(2);
		PrintEvenOdd obj = new PrintEvenOdd();
		service.execute(() -> {
			Thread.currentThread().setName("Even Thread");
			obj.printNumbers();
		});

		service.execute(() -> {
			Thread.currentThread().setName("Odd Thread");
			obj.printNumbers();
		});
		service.shutdown();
	}
}
