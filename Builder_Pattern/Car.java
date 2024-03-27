package com.creational.builder;

public class Car {
	
	private String brand;
	private String model;
	private int power;
	private int CC;
	private int numberOfDoors;
	private boolean hasAC;
	private int bootCapacity;
	
	public Car(String brand, String model, int power, int cC, int numberOfDoors, boolean hasAC, int bootCapacity) {
		this.brand = brand;
		this.model = model;
		this.power = power;
		this.CC = cC;
		this.numberOfDoors = numberOfDoors;
		this.hasAC = hasAC;
		this.bootCapacity = bootCapacity;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + ", power=" + power + ", CC=" + CC + ", numberOfDoors="
				+ numberOfDoors + ", hasAC=" + hasAC + ", bootCapacity=" + bootCapacity + "]";
	}
}
