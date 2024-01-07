package com.behavioural.strategy;

import java.util.ArrayList;
import java.util.List;

public class StrategyDesignPattern {

	public static void main(String[] args) {
		Vehicle volkswagen = new PassengerVehicle();
		Vehicle lamborghini = new SportsVehicle();
		Vehicle quadBike = new OffRoadVehicle();
		Vehicle honda = new PassengerVehicle();
		Vehicle alfaRomeo = new SportsVehicle();
		
		
		List<Vehicle> list = new ArrayList<>();
		list.add(volkswagen);
		list.add(lamborghini);
		list.add(quadBike);
		list.add(honda);
		list.add(alfaRomeo);
		
		list.stream().forEach(vehicle -> vehicle.drive());
	}
}
