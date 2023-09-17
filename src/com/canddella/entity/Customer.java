package com.canddella.entity;

import java.util.ArrayList;

public class Customer {

	private String customerName;
	private ArrayList<Account> accountList;//create Account objects

	public Customer(String customerName, ArrayList<Account> accountList) {
		super();
		this.customerName = customerName;
		this.accountList = accountList;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public ArrayList<Account> getAccountList() {
		return accountList;
	}

	public void setAccountList(ArrayList<Account> accountList) {
		this.accountList = accountList;
	}

}
