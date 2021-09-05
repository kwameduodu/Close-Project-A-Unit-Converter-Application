package four.Lab;

public class ArrayLength {

	public static void main(String[] args) {

//		int[] arr = {1,2,3,4,5,6,7,8,9,10};
//		System.out.println(arr.length);

		// multi-dimensional Arrays

		int[][][] my3dArr = new int[3][3][3];

		my3dArr[0][0][0] = 1;
		System.out.println(my3dArr[0][0][0]);
		
		int[][] my2d = {{1,2,0}, {4,5,6}, {1,4,5} };
		
		System.out.println(my2d.length);
		
		System.out.println(my2d[1][2]);
	}
	
}
