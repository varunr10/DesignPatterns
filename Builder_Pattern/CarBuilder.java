package com.creational.builder;

public class CarBuilder {

	private String brand;
	private String model;
	private int power;
	private int cc;
	private int numberOfDoors;
	private int bootCapacity;
	private boolean hasAC;
	
	public CarBuilder setCarModel(String model) {
		this.model = model;
		return this;
	}
	
	public CarBuilder setCarBrand(String brand) {
		this.brand = brand;
		return this;
	}
	
	public CarBuilder setPower(int power) {
		this.power = power;
		return this;
	}
	
	public CarBuilder setCC(int cc) {
		this.cc = cc;
		return this;
	}
	
	public CarBuilder setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
		return this;
	}
	
	public CarBuilder setBootCapacity(int capacity) {
		this.bootCapacity = capacity;
		return this;
	}
	
	public CarBuilder setAC(boolean status) {
		this.hasAC = status;
		return this;
	}
	
	public Car build() {
		return new Car(brand, model, power, cc, numberOfDoors, hasAC, bootCapacity);
	}
}
	
	
	
