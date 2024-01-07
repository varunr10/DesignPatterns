package com.behavioural.strategy;

public class PassengerVehicle extends Vehicle{

	PassengerVehicle(){
		super(new NormalDrivingStrategy());
	}

}
