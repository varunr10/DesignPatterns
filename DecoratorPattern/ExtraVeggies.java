package com.structural.decorator;

public class ExtraVeggies extends ToppingsDecorator {

	BasePizza basePizza;
	
	ExtraVeggies(BasePizza basePizza){
		this.basePizza = basePizza;
	}
	
	@Override
	public int getPrice() {
		return basePizza.getPrice() + 30;
	}
}
