package com.behavioural.strategy;

public class OffRoadVehicle extends Vehicle{

	public OffRoadVehicle(){
		super(new SpecialDrivingStrategy());
	}

}
