package com.practice;

public class P1Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		int b=10;
		
		first: {
			second: {
				if(a==b >> 1)
					break first;
			}
			System.out.println(a);
		}
		System.out.println(b);
	}

}
