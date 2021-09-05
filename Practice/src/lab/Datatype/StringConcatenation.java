package lab.Datatype;

public class StringConcatenation {

	public static void main(String[] args) {
		
		// the '+' combined the two Strings together
		String beginning = "Helllo";
		String end = " World";
		String  combo = beginning + end;
		
		System.out.println(combo);
		
		// adding a primitive to a string
		long l = 203l;
		System.out.println("The value of l: " + l );
		
		//primitive can also be added at the beginning or middle
		boolean b = true;
		System.out.println(b+ " is true");
		
		//Order Matters 
		/* Any number after or in between String is converted to a string
		 * by java. Unless the primitive data type is at the beginning or in parenthesis.
		 */
		int x = 2;
		int y = 3;
		System.out.println("The sum of x and y is " + x + y); // convert to a string. output is 23
		System.out.println("The sum of x and y is " + (x + y)); // in parenthesis. output is 5
		System.out.println(  x + y + " is the sum of x and y "); // beginning with primitive data type. output is 5

	
	}
}
