import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableTask implements Callable<String>{
	private String name;
	
	public CallableTask(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		CallableTask t1 = new CallableTask("task1");
		CallableTask t2 = new CallableTask("task2");
		CallableTask t3 = new CallableTask("task3");
		CallableTask t4 = new CallableTask("task4");
		CallableTask t5 = new CallableTask("task5");
		
		ExecutorService service = Executors.newFixedThreadPool(3);
		Future<String> res1 = service.submit(t1);
		System.out.println(res1.get());
		
		Future<String> res2 = service.submit(t2);
		System.out.println(res2.get());

		Future<String> res3 = service.submit(t3);
		System.out.println(res3.get());
		
		Future<String> res4 = service.submit(t4);
		System.out.println(res4.get());
		
		Future<String> res5 = service.submit(t5);
		System.out.println(res5.get());
		service.shutdown();
	}

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return "Hi "+name;
	}

}
