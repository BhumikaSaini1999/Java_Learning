package com.design.pattern.Factory;

public class Client1 {
	private Vehicle vehicle;
	
	public Client1(String type, String brandName, String modelNumber) {
		vehicle = VehicleFactory.getVehichle(type, brandName, modelNumber);
	}
	
	
	public Vehicle getVehicle() {
		return vehicle;
	}
}
