//package com.canddella.service;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Scanner;
//
//import com.canddella.entity.Account;
//import com.canddella.entity.CurrentAccount;
//import com.canddella.entity.Customer;
//import com.canddella.entity.SavingsAccount;
//
//public class Service {
//
//	public static Customer createCustomer() {
//
//		char createAccountChoice = 'y';
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Customer name : - ");
//		String customerName = scanner.nextLine();
//		ArrayList<Account> accountList = new ArrayList<Account>();
//		do {
//			accountList.add(createAccount());
//			System.out.println("Do you want create more accounts : - ");
//			createAccountChoice = scanner.next().charAt(0);
//		} while ((createAccountChoice == 'y') || (createAccountChoice == 'Y'));
//
//		return new Customer(customerName, accountList);
//	}
//
//	private static Account createAccount() {
//		// TODO Auto-generated method stub
//
//		Scanner scanner = new Scanner(System.in);
//		int accountChoice;
//		System.out.println("1.Current account 2.SavingsAccount");
//		accountChoice=scanner.nextInt();
//		Account account=null;//declare ref variable
//		if(accountChoice==1)//create obj of savings acnt
//		{
//			System.out.println("Enter the account number : - ");
//			String accountNo = scanner.nextLine();
//			scanner.nextLine();
//			System.out.println("Enter the GST number : - ");
//			String gstNo = scanner.nextLine();
//			 account = new CurrentAccount(accountNo,gstNo);	
//		}
//		else if(accountChoice==2)
//		{
//			System.out.println("Enter the account number : - ");
//			String accountNo = scanner.nextLine();
//			scanner.nextLine();
//			System.out.println("Enter the rate of interest : - ");
//			String rateOfInterest = scanner.nextLine();
//			 account = new SavingsAccount(accountNo,rateOfInterest);		
//		}
//		
//		return account;
//	}
//
//	public static void displayCustomers(ArrayList<Customer> customerList) {
//		// TODO Auto-generated method stub
//
//		for (Customer customer : customerList) {
//			System.out.println("Customer Name : " + customer.getCustomerName());
//			System.out.println("*** Accounts of customer " + customer.getCustomerName() + "****");
//			for (Account account : customer.getAccountList())
//			{
//				System.out.print(account.getAccountNumber() + "    ");
//			System.out.println("");
//			System.out.println("");
//			}
//
//		}
//
//	}
//
//	public static void searchCustomer(HashMap<String, ArrayList<Account>> customerAccountMap) {
//		// TODO Auto-generated method stub
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter the customer name : - ");
//		String customerName = scanner.nextLine();
//		System.out.println("Following are the accounts of the customer");
//		for (Account account : customerAccountMap.get(customerName))//we give hashmap in a loop
//			System.out.print(account.getAccountNumber() + "     ");
//		System.out.println(" ");
//
//	}
//}

package com.canddella.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import com.canddella.entity.Account;
import com.canddella.entity.CurrentAccount;
import com.canddella.entity.Customer;
import com.canddella.entity.Institutional;
//import com.canddella.entity.LoanAccount;
import com.canddella.entity.PlatinumCurrent;
import com.canddella.entity.PlatinumSavings;
//import com.canddella.entity.SavingAccount;
import com.canddella.entity.SavingsMax;
import com.canddella.entity.WomenSaving;

public class Service {

	public static Customer createCustomer() {

		char createAccountChoice = 'y';
		Scanner scanner = new Scanner(System.in);
		System.out.println("Customer name : - ");
		String customerName = scanner.nextLine();
		ArrayList<Account> accountList = new ArrayList<Account>();
		do {
			accountList.add(createAccount());
			System.out.println("Do you want create more accounts : - ");
			createAccountChoice = scanner.next().charAt(0);
		} while ((createAccountChoice == 'y') || (createAccountChoice == 'Y'));

		return new Customer(customerName, accountList);
	}

	private static Account createAccount() {
// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int accountChoice;
		System.out.println(
				"1.Savings Max Account \n 2.Women Savings Account \n 3. Platinum Savings Account\n 4.Institutional Current Account \n5. Platinum Current Account\n");
		accountChoice = scanner.nextInt();
		Account account = null;
		scanner.nextLine();
		if (accountChoice == 1) {
			System.out.println("Enter the account number : - ");
			String accountNo = scanner.nextLine();
			System.out.println("Enter the Rate of Interest number : - ");
			String roi = scanner.nextLine();
			
//			System.out.println("Enter the withdraw amount : - ");
//			double withdraw = scanner.nextDouble();
//			System.out.println("Enter the deposit amount : - ");
//			double deposit = scanner.nextDouble();
			account = new SavingsMax(accountNo, roi);

		} else if (accountChoice == 2) {
			System.out.println("Enter the account number : - ");
			String accountNo = scanner.nextLine();
//			System.out.println("Enter the gst number : - ");
//			String gstNo = scanner.nextLine();
			
//			
			account = new WomenSaving(accountNo);
		} else if (accountChoice == 3) {
			System.out.println("Enter the account number : - ");
			String accountNo = scanner.nextLine();
//			System.out.println("Enter the deposit amount : - ");
//			double deposit = scanner.nextDouble();
//			System.out.println("Enter the close loan date : - ");
//			String closeLoanAccount = scanner.nextLine();
			account = new PlatinumSavings(accountNo);
		}
		else if (accountChoice == 4) {
			System.out.println("Enter the account number : - ");
			String accountNo = scanner.nextLine();
			System.out.println("Enter the GST number : - ");
			String gstNo = scanner.nextLine();
//			System.out.println("Enter the deposit amount : - ");
//			double deposit = scanner.nextDouble();
//			System.out.println("Enter the close loan date : - ");
//			String closeLoanAccount = scanner.nextLine();
			account = new Institutional(accountNo,gstNo);
		}
		else if (accountChoice == 5) {
			System.out.println("Enter the account number : - ");
			String accountNo = scanner.nextLine();
//			System.out.println("Enter the GST number : - ");
//			String gstNo = scanner.nextLine();
//			System.out.println("Enter the deposit amount : - ");
//			double deposit = scanner.nextDouble();
//			System.out.println("Enter the close loan date : - ");
//			String closeLoanAccount = scanner.nextLine();
			account = new PlatinumCurrent(accountNo);
		}


		return account;
	}

	public static void displayCustomers(ArrayList<Customer> customerList) {
//Account account=null;
		SavingsMax savingsMax = null;
		WomenSaving  womenSaving =null;
		PlatinumSavings  platinumSavings=null;
		Institutional institutional=null;
		PlatinumCurrent  platinumCurrent =null;
		
		

		for (Customer customer : customerList) {

			System.out.println("************************Accounts of the customer " + customer.getCustomerName()
					+ "*****************");
			System.out.println("Customer name is:" + customer.getCustomerName());

			for (Account account : customer.getAccountList()) {
				System.out.println(account.getAccountNumber());
				if (account != null) {
					if (account instanceof SavingsMax) {

						 savingsMax = ( SavingsMax) account;
						 savingsMax.withdrawl();
						 savingsMax.deposit();
						 savingsMax.open();
						 savingsMax.close();

						System.out.println("Account number is:" +  savingsMax.getAccountNumber() + "  "
								+ "Rate of interest is:" +savingsMax.getRateOfInterst());
//				
					} else if (account instanceof WomenSaving) {
						womenSaving = (WomenSaving) account;

						womenSaving.withdrawl();
						womenSaving.deposit();
						womenSaving.open();
						womenSaving.close();


						System.out.println("Account number is:" +savingsMax.getAccountNumber() );

					} else if (account instanceof PlatinumSavings) {

						platinumSavings = (PlatinumSavings) account;
						
						platinumSavings.withdrawl();
						platinumSavings.deposit();
						platinumSavings.open();
						platinumSavings.close();
						platinumSavings.getAtmCard();
						platinumSavings.getDiscount();
						
						System.out.println("Account Number is:" +platinumSavings.getAccountNumber());
					}
					else if (account instanceof Institutional) {

						institutional = (Institutional) account;
						
						institutional.withdrawl();
						institutional.deposit();
						institutional.open();
						institutional.close();
						
						System.out.println("Account Number is:" +institutional.getAccountNumber());
					}
					else if (account instanceof PlatinumCurrent) {

						platinumCurrent = (PlatinumCurrent) account;
						
						platinumCurrent.withdrawl();
						platinumCurrent.deposit();
						platinumCurrent.open();
						platinumCurrent.close();
						platinumCurrent.getAtmCard();
						platinumCurrent.getDiscount();
						
						System.out.println("Account Number is:" +institutional.getAccountNumber());
					}

//				loanAccount.closeLoanAccount();
//				currentAccount.deposit();
				}
			}
		}
	}

	public static void searchCustomer(HashMap<String, ArrayList<Account>> customerAccountMap) {
// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the customer name : - ");
		String customerName = scanner.nextLine();
//		System.out.println("Following are the accounts of the customer");
		for (Account account : customerAccountMap.get(customerName))
			System.out.println("Following are the accounts of the customer:" + account.getAccountNumber());
		System.out.println(" ");

	}
}
