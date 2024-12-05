package com.practice;

import java.util.stream.Stream;

public class MainDirection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream.of(Direction.values()).forEach(System.out::println);
		
		System.out.println("-----------------");
		
		for(Direction dir : Direction.values()) {
			System.out.println(dir+" ");
		}
	}

}
