package com.example.demo.exception;

public class errorMessage {
	private String message;
	private String status;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public errorMessage(String message, String status) {
		super();
		this.message = message;
		this.status = status;
	}
	public errorMessage() {
		super();
	}
	
	

}
