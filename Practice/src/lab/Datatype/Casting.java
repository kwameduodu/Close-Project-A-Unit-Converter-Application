package lab.Datatype;

public class Casting {

	public static void main(String[] args) {
		
		int i = 200;
		
		byte a = 127;
		
		/* down casting is converting from a higher number
		 * to a lower number. (moving down)
		 */
		
		//cast to a short
		short s = (short) i;
		System.out.println(s);
		
		//cast to a double
		double d = (double) i;
		System.out.println(d);
		
		//cast to a byte
		byte b = (byte) i;
		System.out.println(b);
		
		/* Up casting is converting a lower number to 
		 * to a higher number. you do not need to define the 
		 * casting type in most situations. (going up)
		 */
		
		//cast int to a long	
		long l = i;
		System.out.println(l);
		
		//cast bit to int
		int ci = a;
		System.out.println(ci);
	}
}
