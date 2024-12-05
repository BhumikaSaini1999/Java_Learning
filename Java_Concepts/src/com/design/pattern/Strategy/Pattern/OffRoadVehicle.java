package com.design.pattern.Strategy.Pattern;

public class OffRoadVehicle extends Vehicle{

	OffRoadVehicle() {
		super(new SportsDriveStrategy());
	}
	
}
