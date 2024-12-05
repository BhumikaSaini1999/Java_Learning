import java.util.concurrent.Executor;

public class ExecutorImpl implements Executor{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ExecutorImpl().execute(()->{
			Thread.currentThread().setName("Child Thread");
			for(int i=1; i<=10; i++) {
				System.out.println(Thread.currentThread().getName()+" "+i);
			}
		});
		
		for(int i=1; i<=10; i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	
	}

	@Override
	public void execute(Runnable command) {
		// TODO Auto-generated method stub
		new Thread(command).start();
	}

}
