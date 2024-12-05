package com.imp.concepts;

class A {
	public static void print(String s) {
		System.out.println("A");
	}
}


class B extends A{
	public static void print(String s) {
		System.out.println("B");
	}
}

public class StaticCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new B();
		obj.print("Bhumi");
		
		B obj1 = new B();
		obj1.print("Bhumi");
		
		A.print("ABAB");
		B.print("BCBC");
	}

}
