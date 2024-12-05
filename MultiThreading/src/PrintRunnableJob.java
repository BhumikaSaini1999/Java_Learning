import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrintRunnableJob implements Runnable {
	int num;

	public PrintRunnableJob(int num) {
		this.num = num;
	}

	@Override
	public void run() {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += num;
		}
		System.out.println(Thread.currentThread().getName() + " is responsible to find sum of first " + num
				+ " numbers and sum is equal to " + sum);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintRunnableJob[] jobs = { new PrintRunnableJob(10), new PrintRunnableJob(5), new PrintRunnableJob(15),
				new PrintRunnableJob(30) };

		ExecutorService service = Executors.newFixedThreadPool(2);
		for (PrintRunnableJob job : jobs) {
			service.submit(job);
		}
		service.shutdown();
	}

}
