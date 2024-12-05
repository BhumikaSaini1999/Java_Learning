//https://www.geeksforgeeks.org/default-methods-java/
	
interface B{	
	default public void show() {
		System.out.println("B class show()");
	}
}

interface C{	
	default public void show() {
		System.out.println("C class show()");
	}
}

public class DefaultMethods2 implements B, C{ //Diamond Problem
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultMethods2 obj = new DefaultMethods2();
		obj.show();
	}

	@Override
	public void show() {//overriden is mandatory in case of Diamond Problem for default methods with same signature
		// TODO Auto-generated method stub
		System.out.println("calling DefaultMethods2 class show() method");
		B.super.show();
		C.super.show();
	}

}
