package com.design.pattern.Strategy.Pattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle = new SportsVehicle();
		vehicle.drive();
		
		Vehicle vehicle2 = new OffRoadVehicle();
		vehicle2.drive();
	}

}
