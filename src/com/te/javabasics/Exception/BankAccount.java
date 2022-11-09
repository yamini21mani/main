package com.te.javabasics.Exception;

public class BankAccount {
	private double balance;

	public BankAccount(double balance) {
		this.balance = balance;
	}

	public  void withdraw(double amount) {
		if (this.balance > amount) {
			this.balance = balance;
			balance = balance - amount;
			System.out.println(this.balance);
		} else {
			throw new InsufficientBalanceException("404 Error not found");
		}
	}

	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount(1000);
		bankAccount.withdraw(2000.00); //exception
	}
}
