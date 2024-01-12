package com.structural.decorator;

public class ExtraOnion extends ToppingsDecorator{

	BasePizza basePizza;
	
	ExtraOnion(BasePizza basePizza) {
		this.basePizza = basePizza;
	}
	
	@Override
	public int getPrice() {
		return basePizza.getPrice() + 5;
	}

}
