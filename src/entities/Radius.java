package entities;

public class Radius {
	private double pi = 3.14159;
	double r;
	
	public Radius(double radius) {
		this.r = radius;
	}
	
	public double Area() {
		return pi * Math.pow(r, 2);
	}
}
