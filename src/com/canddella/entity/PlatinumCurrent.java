package com.canddella.entity;

public class PlatinumCurrent extends CurrentAccount implements Platinum {


	public PlatinumCurrent(String accountNumber) {
		super(accountNumber);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("Open Platinum Current Account");

	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("Close Platinum Current Account");
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Deposit Platinum Current Account:"+5000);
	}

	@Override
	public void withdrawl() {
		// TODO Auto-generated method stub
		System.out.println("Withdraw Platinum Current Account:"+400);

	}

	public void getDiscount() {
		// TODO Auto-generated method stub
		System.out.println("Get Discount for Platinum Current Account");
		
	}

	public void getAtmCard() {
		// TODO Auto-generated method stub
		System.out.println("Get ATM card for Platinum Current Account");
	}

}
