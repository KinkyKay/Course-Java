package com.company.cleanCodeSOLIDTDD.openAndClosedPrinciple;

public class Circle implements Shape {
	private double radius;

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	@Override
	public double calculateArea() {
		return (22/7) * getRadius() * getRadius();
	}
}
