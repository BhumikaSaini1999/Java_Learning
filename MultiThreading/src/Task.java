import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Task implements Runnable{
	private String name;
	
	public Task(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread name: "+Thread.currentThread().getName()+" and Task name: "+name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task t1 = new Task("task1");
		Task t2 = new Task("task2");
		Task t3 = new Task("task3");
		Task t4 = new Task("task4");
		Task t5 = new Task("task5");
		
		ExecutorService service = Executors.newFixedThreadPool(3);
		service.execute(t1);
		service.execute(t2);
		service.execute(t3);
		service.execute(t4);
		service.execute(t5);
		service.shutdown();
	}

}
