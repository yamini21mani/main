package com.te.javabasics.abstraction;

public class CarFactory {
	public static void getCar(Car car) {

		car.accelerate();
		car.airbags();
		car.brake();
		car.gear();

	}
}

