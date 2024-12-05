
public class JoinThread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread mt = Thread.currentThread();
		
		Thread t = new Thread(()->{
			for(int i=1; i<=20; i++) {
				try {
					mt.join(); // calling join() on mainThread mt by childThread
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+" "+i);
			}
		},"mychild");
		t.start();
		
		//t.join();//calling join on childThread t by mainThread, now mainThread will go to pause state and 
		//childThread will be executed completely, after that only mainThread will be executed
		
		for(int i=1; i<=20; i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}

}
