import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class EvenOdd {
	
	Object lock = new Object();
	boolean evenFlag=false;

	public void printOdd() throws InterruptedException {
		for (int i = 1; i <= 20; i += 2) {
			synchronized(lock){
				while(evenFlag)//it will wait when evenFlag=true
					lock.wait();
				
				System.out.println("OddThread - " + i);
				evenFlag=true;
				lock.notify();
			}
		}
	}

	public void printEven() throws InterruptedException {
		for (int i = 2; i <= 20; i += 2) {
			synchronized(lock) {
				while(!evenFlag)//it will wait when evenFlag=false
					lock.wait();
				
				System.out.println("EvenThread - " + i);
				evenFlag=false;
				lock.notify();
			}
		}
	}
}

public class EvenOddPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService service = Executors.newFixedThreadPool(2);
		
		EvenOdd obj = new EvenOdd();
		service.execute(()->{
			try {
				obj.printEven();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
		service.execute(()->{
			try {
				obj.printOdd();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
		service.shutdown();
	}

}
