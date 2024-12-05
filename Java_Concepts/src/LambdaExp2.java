interface FuncInterface1 {
	int abstractFun(int x);

	default void show() {
		System.out.println("show() in FuncInterface1");
	}
}

public class LambdaExp2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FuncInterface1 obj = new FuncInterface1() {//Anonymous Inner class

			@Override
			public int abstractFun(int x) {
				// TODO Auto-generated method stub
				return x*x;
			}
		};
		
		System.out.println(obj.abstractFun(7));
		obj.show();
	}

}
