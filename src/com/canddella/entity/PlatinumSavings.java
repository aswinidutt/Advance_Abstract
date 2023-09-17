package com.canddella.entity;

public class PlatinumSavings extends SavingsAccount implements Platinum {

	

	public PlatinumSavings(String accountNumber) {
		super(accountNumber);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("Open Platinum Savings Account");

	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("Close Platinum Savings Account");

	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Deposit Platinum Savings Account:"+7000);

	}

	@Override
	public void withdrawl() {
		// TODO Auto-generated method stub
		System.out.println("Withdraw Platinum Savings Account:"+700);

		

	}

	public void getDiscount() {
		// TODO Auto-generated method stub
		System.out.println("Get Discount for Platinum Savings Account");
		
	}

	public void getAtmCard() {
		// TODO Auto-generated method stub
		
		System.out.println("Get ATM Card for Platinum Savings  Account");
		
	}

	
}
