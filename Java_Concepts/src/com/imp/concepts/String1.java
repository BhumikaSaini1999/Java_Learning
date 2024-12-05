package com.imp.concepts;

public class String1 {
	public static void main(String args[]) {
		String s = new String("durga");
		s.concat("software");//strings are immutable, we are trying to change existing string
		//so it won't happen in existing string, but a new string got created separately with durga software which is having no refrence
		System.out.println(s);
		
		
		String s1 = new String("durga");
		s1=s1.concat("software");
		System.out.println(s1);
	}
}
