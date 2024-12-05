interface TestInterface{
	int sum(int a, int b);
	
	static void show() {//never available to implementation class
		System.out.println("static method in TestInterface called");
	}
}

//public class StaticMethodsInInterface implements TestInterface{
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		System.out.println(new StaticMethodsInInterface().sum(8, 2));
//		TestInterface.show(); //directly called on interface itself
//	}
//
//	@Override
//	public int sum(int a, int b) {
//		// TODO Auto-generated method stub
//		return a+b;
//	}
//
//}

public class StaticMethodsInInterface {
	public static void main(String[] args) {
		TestInterface obj = (a,b)->a+b;
		System.out.println(obj.sum(6, 2));
		TestInterface.show();
	}
}
