interface FuncInterface2 {
	int abstractFun(int x);

	default void show() {
		System.out.println("show() in FuncInterface2");
	}
}

public class LambdaExp3{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FuncInterface2 obj = (x)->x*x; //lambda expression
		
		System.out.println(obj.abstractFun(7));
		obj.show();
	}

}
