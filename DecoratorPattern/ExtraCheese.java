package com.structural.decorator;

public class ExtraCheese extends ToppingsDecorator{

	BasePizza pizza;
	
	ExtraCheese(BasePizza pizza){
		this.pizza = pizza;
	}
	
	@Override
	public int getPrice() {
		return this.pizza.getPrice() + 20;
	}

}
