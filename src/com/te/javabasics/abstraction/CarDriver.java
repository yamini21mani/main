package com.te.javabasics.abstraction;

import java.util.Scanner;

public class CarDriver {
	
	 Scanner s = new Scanner(System.in);
		System.out.println("Enter the car type");
		String carname = s.next();
		if (carname == "Audi") {
			return new Audi();
		} else if (carname == "BMW") {
			return new BMW();
		}else {
			System.out.println("Invaid option");
		}

	}

}
