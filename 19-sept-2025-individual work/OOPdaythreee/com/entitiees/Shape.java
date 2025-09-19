package com.entitiees;

	public abstract class Shape {
	    public abstract double calculateArea();
	    public abstract double calculatePerimeter();

	    @Override
	    public String toString() {
	        return "Area = " + calculateArea() + ", Perimeter = " + calculatePerimeter();
	    }
	}	
	
	

