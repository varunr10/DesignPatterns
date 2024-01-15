package com.creational.factory;

public class FactoryDesignPattern {
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape circle = shapeFactory.getShape("CIRCLE");
		circle.draw();
		Shape rectangle = shapeFactory.getShape("RECTANGLE");
		rectangle.draw();
		Shape other = shapeFactory.getShape("other");
		other.draw();
		Shape circle2 = shapeFactory.getShape("CIRCLE");
		circle2.draw();
		Shape square = shapeFactory.getShape("SQUARE");
		square.draw();
	}
}
