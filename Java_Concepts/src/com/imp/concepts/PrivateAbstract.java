package com.imp.concepts;

class AAAA {
	private abstract class InnerAbstractClass {
		// Abstract method
		abstract void doSomething();

		// Concrete method
		void doSomethingElse() {
			System.out.println("Doing something else");
		}
	}

	// Concrete subclass of the abstract inner class
	private class ConcreteInnerClass extends InnerAbstractClass {
		@Override
		void doSomething() {
			System.out.println("Doing something");
		}
	}

	public void useInnerClass() {
		InnerAbstractClass instance = new ConcreteInnerClass();
		instance.doSomething();
		instance.doSomethingElse();
	}
}

public class PrivateAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AAAA p = new AAAA();
		p.useInnerClass();
	}

}
