import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class PrintCallableJob implements Callable<Integer>{
	int num;
	
	public PrintCallableJob(int num) {
		this.num=num;
	}

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+" is responsible to find sum of first "+num+" numbers");
		int sum=0;
		for(int i=1; i<=num; i++) {
			sum+=num;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintCallableJob[] jobs = {new PrintCallableJob(10),
				new PrintCallableJob(5), new PrintCallableJob(15), new PrintCallableJob(30)};
		
		ExecutorService service = Executors.newFixedThreadPool(2);
		for(PrintCallableJob job : jobs) {
			Future<Integer> f = service.submit(job);
			try {
				System.out.println(f.get());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		service.shutdown();
	}

}
