package com.github.sanchezih.solid._02_ocp.ok;

public class AreaCalculator {
	public double calculateTotalArea(Shape[] shapes) {
		double totalArea = 0;
		for (Shape shape : shapes) {
			totalArea += shape.calculateArea();
		}
		return totalArea;
	}
}
