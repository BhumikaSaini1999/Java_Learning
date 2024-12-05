
public class Deadlock2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.currentThread().join(); //calling join() on itself i.e. main=>lead to deadlock state

		
		for(int i=1; i<=20; i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
		
	}

}
