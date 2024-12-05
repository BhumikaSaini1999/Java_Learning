package com.implementation;

public class TestMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMap<String,Integer> map = new MyMap<>();
		map.put("Bhumika", 65);
		map.put("Neeraj", 34);
		map.put("Hema", 23);
		map.put("Sonali", 12);
		map.put("Bhumika", 100);
		
		System.out.println(map.get("Bhumika"));
		System.out.println(map.get("Hema"));
		System.out.println(map.get("Neeraj"));
		
		map.remove("Sonali");
		System.out.println(map.get("Sonali"));
	}

}
