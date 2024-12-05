class TestClass{
     public void show() { //should be public bcoz default method in interface is public as they have same signature
    	 //Error without public: 	- The inherited method TestClass.show() cannot hide the public abstract method in TestInterface1
		System.out.println("show() method of TestClass");
	}
}

interface TestInterface1{
	default void show() {
		System.out.println("show() method of TestInterface1");
	}
}

public class DefaultMethods3 extends TestClass implements TestInterface1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DefaultMethods3().show(); //class method is having preference over Interface
	}

}
