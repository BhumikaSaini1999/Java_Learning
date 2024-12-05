package com.imp.concepts;

public class StringInterning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="java"; //in SCP
		String s2 = new String("java"); //in Heap
		
		System.out.println(s1.equals(s2)); //true
		System.out.println(s1==s2); //false
		
		s2=s2.intern(); //start pointing s2 refrence in SCP
		System.out.println(s1==s2);
	}

}
