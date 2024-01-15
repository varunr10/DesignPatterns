package com.creational.abstractfactory;

public class LuxuryVehicleFactory implements VehicleFactory{

	@Override
	public Vehicle getVehicle(String brand) {
		switch(brand) {
			case "NISSAN":
				return new GTR();//
			case "BUGATTI":
				return new Veyron();
			default:
				return null;
		}
	}

}
