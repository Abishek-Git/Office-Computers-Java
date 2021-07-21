package com.java.office;

@SuppressWarnings("serial")
public class ComputerNotFoundException extends Exception {
	private String msg = "Item not Found";
	

	public ComputerNotFoundException() {
		super();
	}

	public ComputerNotFoundException(String msg) {
		super();
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
}
