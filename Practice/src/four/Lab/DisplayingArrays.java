package four.Lab;

public class DisplayingArrays {

	public static void main(String[] args) {

		int[] intArray = new int[3];

		// output address of the memory location of the array
//		System.out.println(intArray);

		intArray[0] = -5123;
		intArray[2] = 32;

		System.out.println(intArray[3]);  // get runtime exception arrayIndexOutOfBoundsException

	}

}
