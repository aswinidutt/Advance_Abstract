package com.canddella.entity;

public class WomenSaving extends SavingsAccount {

	

	public WomenSaving(String accountNumber) {
		super(accountNumber);
		// TODO Auto-generated constructor stub
	}



	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("Open  Women Savings  Account");
	}

	

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("Close Savings Max Account");
	}

	

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Deposit:"+700);
	}

	

	@Override
	public void withdrawl() {
		// TODO Auto-generated method stub
		System.out.println("Withdraw:"+100);
	}

	}


