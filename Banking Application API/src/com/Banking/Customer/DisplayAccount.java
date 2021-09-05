package com.Banking.Customer;

public class DisplayAccount {
	
	
	
		
		public void DisplayAccount () {
			if(deposited() == 0.00) {
			System.out.println("Current account balance is $0.00");
			
			} else {
				System.out.println("Current account balance is $"+deposited());
				
			}
			
}
