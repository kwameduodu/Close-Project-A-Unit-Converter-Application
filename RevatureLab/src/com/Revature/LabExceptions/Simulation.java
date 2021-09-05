package com.Revature.LabExceptions;

import java.util.Scanner;

public class Simulation {

	public static void main(String[] args) {
		getInput();

	}
	
	public static void getInput() {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Type in a number and press Enter...");
		
		String line =in.nextLine();
		
		System.out.println("You've typed: "+ line);
		
		in.close();
	}
	
	public static boolean isEven(String num) {
		
		//convert value to a number
		
		int value = Integer.parseInt(num);
		
		return (value % 2 == 0);
	}

}
