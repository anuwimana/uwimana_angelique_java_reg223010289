package com.entitiees;

	public class Circle extends Shape {
	    private double radius;
	    public Circle() { this.radius = 7; }

	    @Override
	    public double calculateArea() { return Math.PI * radius * radius; }

	    @Override
	    public double calculatePerimeter() { return 2 * Math.PI * radius; }
	}

