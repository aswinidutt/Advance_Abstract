package com.canddella.entity;

public class SavingsMax extends SavingsAccount {

	private String rateOfInterst;

	public SavingsMax(String accountNumber, String rateOfInterst) {
		super(accountNumber);
		this.rateOfInterst = rateOfInterst;
		
	}

	public String getRateOfInterst() {
		return rateOfInterst;
	}

	public void setRateOfInterst(String rateOfInterst) {
		this.rateOfInterst = rateOfInterst;
	}

	@Override
	public void open() {
		System.out.println("Open Savings Max Account");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("Close Savings Max Account");

	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Deposit :"+5000);
		

	}

	@Override
	public void withdrawl() {
		// TODO Auto-generated method stub
		System.out.println("Withraw :"+300);

	}

}
