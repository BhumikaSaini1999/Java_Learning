package com.design.pattern.Strategy.Pattern;

public class Vehicle {
	
	DriveStrategy driveObj;
	
	//Constructor injection
	Vehicle(DriveStrategy driveObj){
		this.driveObj = driveObj;
	}

	public void drive() {
		driveObj.drive();
	}
}
