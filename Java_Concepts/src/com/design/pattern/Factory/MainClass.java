package com.design.pattern.Factory;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client1 client = new Client1("Car","XYZ","8745");
		client.getVehicle().printVehicle();
	}

}
