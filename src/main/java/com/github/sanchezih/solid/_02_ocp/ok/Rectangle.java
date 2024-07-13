package com.github.sanchezih.solid._02_ocp.ok;

//Rectangle implementation
public class Rectangle implements Shape {
	
	private double width;
	private double height;

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double calculateArea() {
		return width * height;
	}
}
