package com.te.javabasics.Exception;

public class InsufficientBalanceException extends RuntimeException{

	 String message;
	public InsufficientBalanceException(String message) {
		this.message=message;
	}
	@Override
	public String getMessage() {
		return this.message;
	}
}
