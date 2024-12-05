package com.design.pattern.Factory;

public class Car implements Vehicle {
	String brandName;
	String modelNo;

	public Car(String bName, String mNumber) {
		this.brandName = bName;
		this.modelNo = mNumber;
	}

	@Override
	public void printVehicle() {
		// TODO Auto-generated method stub
		System.out.println("Car Brand Name: "+brandName+"  Car Model Number: "+modelNo);
	}

}
