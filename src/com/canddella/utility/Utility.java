package com.canddella.utility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import com.canddella.entity.Account;
import com.canddella.entity.Customer;
import com.canddella.service.Service;

public class Utility {

	public static void main(String[] args) {

		HashMap<String, ArrayList<Account>> customerAccountMap = new HashMap();
		Scanner scanner = new Scanner(System.in);
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		int choice;
		char continueChoice = 'y';
		Customer customer = null;//initialisation not obj creation
		do {

			System.out.println("1.Create Customer 2.Display Customer 3.Search Customer");
			choice = scanner.nextInt();
			switch (choice) {

			case 1:
				customer = Service.createCustomer();
				customerList.add(customer);
				customerAccountMap.put(customer.getCustomerName(), customer.getAccountList());
				break;

			case 2:
				Service.displayCustomers(customerList);
				break;
			case 3:
				Service.searchCustomer(customerAccountMap);
				break;
			default:
				System.out.println("Wrong choice");

			}
			System.out.println("Press Y or y to go to main menu : - ");
			continueChoice = scanner.next().charAt(0);

		} while ((continueChoice == 'y') || (continueChoice == 'Y'));

	}

}