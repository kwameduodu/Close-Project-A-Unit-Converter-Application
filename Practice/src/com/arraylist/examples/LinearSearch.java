package com.arraylist.examples;

public class LinearSearch {

	public static void main(String[] args) {
	
		char letter = 'd';
		char[] letters = {'a', 'b', 'x' , 'q' , 'd', 'y' , 'f', 'v'};
		
		System.out.println(findIndex(letter, letters));
		
		}
	
	public static int findIndex(char target , char[] data) {
		
		int result = -1;
		
		for (int i =  0; i < data.length; i++) {
			char temp = data[i];
			
			if(temp == target) {
				return i;
			}
		}
		
		return result;

	}

}
