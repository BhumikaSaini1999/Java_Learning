package com.design.pattern.Factory;

public class Bike implements Vehicle{
	
	String brandName;
	String modelNo;

	public Bike(String bName, String mNumber) {
		this.brandName = bName;
		this.modelNo = mNumber;
	}

	@Override
	public void printVehicle() {
		// TODO Auto-generated method stub
		System.out.println("Bike Brand Name: "+brandName+"  Bike Model Number: "+modelNo);
	}

}
