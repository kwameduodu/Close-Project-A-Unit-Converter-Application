package four.Lab;

public class Loops {

	public static void main(String[] args) {

//		boolean on = false;
		// while loop
//		while (on) {
//			System.out.println("inside the while loop");
//
//			on = false;
//		}

		// do while loop. The program will execute at least once
//		do {
//			System.out.println("inside the do-while loop");
//		} while (on);
		
//		//for loop that will print 1 to 10
//		for(int i = 0; i <= 10; i++) {
//			System.out.println(i);
//		}
		
		//Nested for-loop
		
		int[] arr1 = {2,4,6,8,10,12,14,16,18 ,20};
		int[] arr2 = {1,3,5,7,9,13,11,13,17,19};
		
		//iterate over the first set of numbers
		for( int i = 0; i <= arr1.length-2; i++) {
			//iterate over the second set of numbers
//			for(int j = 0; j < arr2.length; j++) {
				
				//print the product of the current elements from each set
				System.out.println(arr1[i]);
//			}
		}
	}
}
