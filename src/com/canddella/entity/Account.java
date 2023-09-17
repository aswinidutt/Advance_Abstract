package com.canddella.entity;

public abstract class Account {
	
	private String accountNumber;

	public Account(String accountNumber) {
		super();
		this.accountNumber = accountNumber;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public abstract void open();
	public abstract void close();
	public abstract void deposit();
	public abstract void withdrawl();
	
	

}
