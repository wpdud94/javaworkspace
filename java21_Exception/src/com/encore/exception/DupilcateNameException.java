package com.encore.exception;

public class DupilcateNameException extends Exception {
	public DupilcateNameException() {
		this("This is DupilcateNameException...");
	}
	
	public DupilcateNameException(String message) {
		super(message);
	}
}
