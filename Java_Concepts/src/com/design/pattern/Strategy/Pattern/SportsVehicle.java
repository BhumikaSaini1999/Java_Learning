package com.design.pattern.Strategy.Pattern;

public class SportsVehicle extends Vehicle{

	SportsVehicle() {
		super(new SportsDriveStrategy());
	}
	
}
