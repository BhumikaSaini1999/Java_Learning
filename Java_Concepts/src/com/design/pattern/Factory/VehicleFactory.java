package com.design.pattern.Factory;

public class VehicleFactory {
	
	public static Vehicle getVehichle(String type, String brandName, String modelNumber) {
		if("Car".equals(type))
			return new Car(brandName, modelNumber);
		else if("Bike".equals(type))
			return new Bike(brandName, modelNumber);
		else
		    return null;	
	}
}
