package com.te.javabasics.abstraction;

public class Audi implements Car {

	public void accelerate() {
		System.out.println("The acceleration starts in Audi");
	}

	public void brake() {
		System.out.println("The Audi is stopped");

	}

	public void gear() {
		System.out.println("Audi is shifting Gears");
	}
	public void airbags() {
		System.out.println("Audi has Airbags");
	}
	public void gps() {
		System.out.println("Audi has GPS");
	}
}

