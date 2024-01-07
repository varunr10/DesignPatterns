package com.behavioural.strategy;

public class NormalDrivingStrategy implements DrivingStrategy {

	@Override
	public void drive() {
		System.out.println("Normally driving this......");
	}

}
