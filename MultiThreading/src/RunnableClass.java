
//class ThreadSample implements Runnable{
//
//	@Override
//	public void run() {
//		// TODO Auto-generated method stub
//		for(int i=1; i<=20; i++) {
//			System.out.println(Thread.currentThread().getName()+" "+i);
//		}
//	}
//	
//}
public class RunnableClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ThreadSample runnable = new ThreadSample();
		new Thread(()->{
			for(int i=1; i<=20; i++) {
				System.out.println(Thread.currentThread().getName()+" "+i);
			}
		},"mychild").start();
		
		for(int i=1; i<=20; i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}

}
