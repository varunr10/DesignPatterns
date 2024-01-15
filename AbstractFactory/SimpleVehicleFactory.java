package com.creational.abstractfactory;

public class SimpleVehicleFactory implements VehicleFactory{

	@Override
	public Vehicle getVehicle(String brand) {
		switch(brand) {
			case "MARUTI":
				return new Swift();//
			case "HYUNDAI":
				return new Santro();
			default:
				return null;
		}
	}

}
