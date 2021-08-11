package main;

import java.util.Scanner;



public class Converter {

	public static void main(String[] args) {
		
		int menuSelection;

		
		//user input variable
		Scanner user_menu = new Scanner(System.in);

		
		int user_option = user_menu.nextInt();
		
	
		//Print menu with number options
		while (menuSelection) {
			
			System.out.println("Please select an option: " +
				"1. Cups to Teaspoons" +
				"2. Miles to Kilometers" +
				"3. US Gallons to Imperial Gallons" +
				"4. Quit");
		
		
		switch (user_option) {
		case 1: System.out.println(user_option*48 + "Teaspoons");
			break;
			

		case 2:System.out.println( user_option*1.6 + "Kilometers");
			break;
			
		case 3:System.out.println( user_option/1.201 + "gallons");
			break;
			
		case 4:System.out.println( "The end");
			break;
		default:
			System.out.println("The option does not exist");
		
		}
	}
  
	}

}
