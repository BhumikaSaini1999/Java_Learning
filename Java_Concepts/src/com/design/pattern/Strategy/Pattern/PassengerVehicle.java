package com.design.pattern.Strategy.Pattern;

public class PassengerVehicle extends Vehicle {

	PassengerVehicle() {
		super(new NormalDriveStrategy());
	}

}
