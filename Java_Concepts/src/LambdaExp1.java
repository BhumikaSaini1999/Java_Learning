interface FuncInterface {
	int abstractFun(int x);

	default void show() {
		System.out.println("show() in FuncInterface");
	}
}

class FuncClass implements FuncInterface{ //we are using class FuncClass just to implement FuncInterface (we can avoid this)

	@Override
	public int abstractFun(int x) {
		// TODO Auto-generated method stub
		return x*x;
	}
	
}

public class LambdaExp1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FuncInterface obj = new FuncClass();
		System.out.println(obj.abstractFun(8));
		obj.show();
	}

}
