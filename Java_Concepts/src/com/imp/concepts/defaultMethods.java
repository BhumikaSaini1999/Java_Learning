package com.imp.concepts;

//class has more power than interfaces
interface AA {
	public default void print() {
		System.out.println("interface AA method");
	}
}

interface BB {

}

class CC implements AA, BB {
	public void print() {
		System.out.println("class CC method");// class has more power than interface
	}
}

public class defaultMethods {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AA obj = new CC();
		obj.print();
	}

}
