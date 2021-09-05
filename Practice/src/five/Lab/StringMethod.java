package five.Lab;

public class StringMethod {

	public static void main(String[] args) {

		String str = "Hello";
		String s = new String("Hello");
		
		System.out.println(str.equals(s));
		
		//use the length() method
		System.out.println(str.length());
		
		//use the indexOf() method
		System.out.println(str.indexOf("H"));
	}

}
