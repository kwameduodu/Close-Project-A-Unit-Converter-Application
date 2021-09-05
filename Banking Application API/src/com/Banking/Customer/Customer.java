package com.Banking.Customer;

import java.util.Scanner;

public class Customer {
	
	String name;
	String account;
	double amount;
	static Scanner scan;
	DisplayAccount displayAccount;
	
	public Customer() {
		super();
	}
	
	public Customer(String name, String account, double amount) {
		this.name = name;
		this.account = account;
		this.amount = amount;
	}
	
	public void createLogIn () {
		
	scan = new Scanner(System.in);
		
		
		// ask user for their username
		System.out.println("Enter your username");
			String userName = scan.nextLine();
		
		// check to see if username is empty or is longer than 20 characters
		while (userName.isEmpty() || userName.length() < 10) {
			System.out.println("Invalid user name. Please try again");
				userName = scan.nextLine();
		}
		// ask user for password
		System.out.println("Enter your password");
			String userPassword = scan.nextLine();
		 
		/* check to see if password is empty or is longer than 8 characters
		* request for a new password if condition is meet
		*/
		while (userPassword.isEmpty() || userPassword.length()< 8) {
			
			System.out.println("Password did not meet the requirement. try again");
				userPassword = scan.nextLine();
		
		}
		
		if(userName.equals(userName) && userPassword.equals(userPassword)) {
			System.out.println( userName + " You have successful login");
		}else {
			System.out.println("Login failed");
		}
		
	}
public static DisplayAccount getDeposited() {
		
		System.out.println("How much would you like to deposit");
		;
			double amount = scan.nextDouble();
			System.out.println(amount);
			
			return amount;
		
			
		}
	

	
	

}
