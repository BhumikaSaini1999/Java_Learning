package com.design.pattern.Factory;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle = VehicleFactory.getVehichle("Car", "XUV500", "76345GHT");
		vehicle.printVehicle();
		
		Vehicle vehicle2 = VehicleFactory.getVehichle("Bike", "ABC", "8762IK");
		vehicle2.printVehicle();
	}

}
