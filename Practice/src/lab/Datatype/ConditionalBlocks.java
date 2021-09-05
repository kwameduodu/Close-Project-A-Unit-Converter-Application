package lab.Datatype;

public class ConditionalBlocks {

	public static void main(String[] args) {
		
		boolean b = false;
//		boolean c = true
		boolean firstCondition = true;
		boolean secondCondition = false;
		
		/*
		 * Check to see if the condition is true. if condition is fall the program
		 * execute code outside the if statement
		 */
//		if(b) {
//			System.out.println("Inside the  first if-statement");
//		}
//		
//		System.out.println("Outside of the first if-statement");
//	
//		
//		//Program execute statement inside the if statement if condition is true
//		if(c) {
//			System.out.println("Inside the second if-statement");
//		}
//		
//		System.out.println("Outside of the second if-statement");
		
		
		//else statements
//		
//		if(b) {
//			System.out.println("inside the if-statement");
//			
//		}else {
//			System.out.println("inside the else-statement");
//		}
//		System.out.println("Outside of the if-statement");
//		
		
		//Nested if-statement
//		if (firstCondition) {
//			System.out.println("inside the if-statement");
//			
//			if(secondCondition) {
//				System.out.println("inside the nested if-statement");
//			}
//		} else {
//			System.out.println("inside the else-statement");
//		}
//		System.out.println("outside of the if-statement");
		
		//else-if statements
		if(firstCondition) {
			System.out.println("inside the if-statement");
			
			if (secondCondition) {
				System.out.println("inside the nested if-statement");
			}
		} else if (secondCondition) {
			System.out.println(5);
		}else {
			System.out.println("insde the else-statement");
		}
		System.out.println("Outside of the if-statement");
	}
}
