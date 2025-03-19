package com.Shopping_Application.program;

@SuppressWarnings("serial")
class InsufficientQuantityException extends Exception{
	public InsufficientQuantityException(String message) {
		super(message);
	}
}
@SuppressWarnings("serial")
class InvalidProductException extends Exception{
	public InvalidProductException(String message) {
		super(message);
	}
}