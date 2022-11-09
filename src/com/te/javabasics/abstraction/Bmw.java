package com.te.javabasics.abstraction;

public class Bmw implements Car {
	public void accelerate() {
		System.out.println("BMW acceleration starts");
	}

	public void brake() {
		System.out.println("BMW is stopped");

	}

	public void gear() {
		System.out.println("Gear is triggered in BMW");
	}
	public void airbags() {
		System.out.println("BMW has Airbags");
	}
	public void gps() {
		System.out.println("BMW has GPS");
	}
	
}
