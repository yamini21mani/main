package com.te.project.restaurant;

import java.util.Scanner;

public class Menu {
	static double amount = 0;
	static double amount1;
	static double amount2;
	static Scanner s = new Scanner(System.in);
	static String[][] menuitems = { { "Biryani", " ", " " }, { " ", "Paneer Biryani", "Rs.150" },
			{ " ", "Mushroom Biryani", "Rs.120" } };
	public static void welcome() {
		System.out.println("Welcome to MyHotel-Purely Veg");
		System.out.println("Please have a look on delicious Items available from us");
	}
	public static void displaymenu() {
		System.out.println("1." + menuitems[1][1] + "	" + menuitems[1][2]);
		System.out.println("2." + menuitems[2][1] + "	" + menuitems[2][2]);
	}

	public static void order() {
		System.out.println("Enter your menu");
		int choice = s.nextInt();

		switch (choice) {
		case 1: {
			System.out.println("Order of your choice");
			System.out.println("Enter no of panneer biryani");
			int qty1 = s.nextInt();
			System.out.println("Processing");
			amount1 = qty1 * 150;
			System.out.println(amount1);
			break;
		}
		case 2: {
			System.out.println("Enter no of Mushroom biryani");
			int qty2 = s.nextInt();
			amount2 = qty2 * 120;
			System.out.println(amount2);
			break;
		}

		default:
			System.out.println("Enter valid choice");
		}

	}

	public static void bill() {
		System.out.println("Anything else ......yes/No");
		String ch = s.next();
		if (ch.equals("yes")) {
			displaymenu();
			order();
			bill();
		} else if (ch.equals("no")) {
			System.out.println("Processing your bill");
			double amount = amount1 + amount2;
			System.out.println("The Total amount is :" + amount);
		}

	}

	public static void orderid() {
		double a = Math.random() + 1000;
		int id = (int) a;
		System.out.println("Order is successfully placed");
		System.out.println("The order ID is " + id);
		System.out.println("Thanks for ordering");

	}

	public static void main(String[] args) {
		welcome();
		displaymenu();
		order();
		bill();
		orderid();
	}
}
