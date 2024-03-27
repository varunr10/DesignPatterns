package com.creational.builder;

public class BuilderDesignPattern {

	public static void main(String[] args) {
		CarBuilder builder = new CarBuilder();
		Car toyotaInnova = builder.setCarBrand("TOYOTA")
				.setCarModel("INNOVA").setCC(2000)
				.setBootCapacity(10000).setPower(220)
				.setNumberOfDoors(6).setAC(true)
				.build();
		System.out.println(toyotaInnova.toString());
		
		Car nissanMagnite = builder.setCarBrand("NISSAN")
				.setCarModel("MAGNITE").setCC(1200)
				.setBootCapacity(4000).setPower(80)
				.setNumberOfDoors(4).setAC(true)
				.build();
		System.out.println(nissanMagnite.toString());
		
		System.out.println(toyotaInnova.toString());
		
	}
}
