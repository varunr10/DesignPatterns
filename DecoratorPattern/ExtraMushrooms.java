package com.structural.decorator;

public class ExtraMushrooms extends ToppingsDecorator{

	BasePizza basePizza;
	
	ExtraMushrooms(BasePizza basePizza) {
		this.basePizza = basePizza;
	}
	
	@Override
	public int getPrice() {
		return basePizza.getPrice() + 50;
	}

}
