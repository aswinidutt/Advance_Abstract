package com.canddella.entity;

public class Institutional extends CurrentAccount {
	private String gstNo;

	
	public Institutional(String accountNumber, String gstNo) {
		super(accountNumber);
		this.gstNo = gstNo;
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("Open Institutional Account");

	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("Close Institutional Account");

	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Deposit:"+2000);

	}

	@Override
	public void withdrawl() {
		// TODO Auto-generated method stub
		System.out.println("Withdraw:"+500);

	}

}
