package com.imp.concepts;

final class Test {

	private final int i;

	Test(int i) {
		this.i = i;
	}

	Test modify(int i) {
		if (this.i == i)
			return this;
		else
			return new Test(i);
	}
}

public class ImmutableClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1 = new Test(10);
		Test t2 = t1.modify(10);
		System.out.println(t1==t2);
	}

}
