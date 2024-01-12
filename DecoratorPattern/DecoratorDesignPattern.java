package com.structural.decorator;

public class DecoratorDesignPattern {
	
	public static void main(String[] args) {
		BasePizza pizza = new ExtraMushrooms(new ExtraVeggies(new ExtraCheese(new SupremePizza())));
		
		System.out.println("The bill is " + pizza.getPrice());
	}
}
