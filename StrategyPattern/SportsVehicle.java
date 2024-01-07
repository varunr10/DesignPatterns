package com.behavioural.strategy;

public class SportsVehicle extends Vehicle {


	SportsVehicle(){
		super(new SpecialDrivingStrategy());
	}
	
}
