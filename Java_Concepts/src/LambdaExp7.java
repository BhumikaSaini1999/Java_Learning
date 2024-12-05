public class LambdaExp7 {
	
	interface TestInterface{
		int operation(int x, int y);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		TestInterface add = (a,b)->a+b;
		System.out.println(add.operation(4, 5));
		
		TestInterface mul = (a,b)->a*b;
		System.out.println(mul.operation(4, 5));
		
		TestInterface sub = (a,b)->a-b;
		System.out.println(sub.operation(10, 8));
		
		TestInterface div = (a,b)->a/b;
		System.out.println(div.operation(10, 2));
	}

}
