
class MyThread extends Thread{
	public void run() {
		for(int i=1; i<=20; i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
}
public class ThreadClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t = new MyThread();
		t.start();
		
		for(int i=1; i<=20; i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}

}
