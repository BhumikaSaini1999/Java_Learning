//https://www.geeksforgeeks.org/default-methods-java/

interface A{
	int square(int n); // by default public abstract
	
	default public void show() {
		System.out.println("A class show(): ");
	}
}

public class DefaultMethods1 implements A{
	
	@Override
	public int square(int n) {
		// TODO Auto-generated method stub
		return n*n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultMethods1 obj = new DefaultMethods1();
		
		System.out.println(obj.square(4));
		obj.show();//default methods are available to implementation class unless its overriden(Diamond Problem) 
	}
}
