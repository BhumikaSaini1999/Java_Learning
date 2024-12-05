package com.imp.concepts;

class AAA {
	public void print() {
		System.out.println("AAA");
	}
}


class BBB extends AAA{
	public void print() {
		System.out.println("BBB");
	}
}

public class NormalMethods {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AAA obj = new AAA();
		obj.print();
		
		BBB obj1 = new BBB();
		obj1.print();
		
		AAA obj2 = new BBB();
		obj2.print();
		
	}

}
