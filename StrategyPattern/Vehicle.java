package com.behavioural.strategy;

public class Vehicle {

	public DrivingStrategy drivingStrategy;

	public Vehicle(DrivingStrategy strategy) {
		this.drivingStrategy = strategy;
	}

	public void drive() {
		this.drivingStrategy.drive();
	}

}
