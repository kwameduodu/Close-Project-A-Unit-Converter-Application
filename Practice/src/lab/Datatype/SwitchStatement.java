package lab.Datatype;

public class SwitchStatement {
 
	public static void main(String args[]) {
		int x = 5;
		
		
		/* whatever case is met first, all other cases below 
		 * it will execute.
		 */
		
		// fall- through logic
//		switch(x) {
//		case 6: System.out.println(" case 6 ran");
//		default: System.out.println(" the default case ran. ");
//		case 7: System.out.println(" case 7 ran");
//		case 10: System.out.println(" case 10 ran");
//		
//		}
		// break statement to exit a particular case to avoid fall-through logic
		switch(x) {
		case 6: System.out.println(" case 6 ran");
			break;
		default: System.out.println(" the default case ran. ");
		break;
		case 7: System.out.println(" case 7 ran");
		break;
		case 10: System.out.println(" case 10 ran");
		
		}
		
		// curly braces could be use to group statements
		switch(x) {
		case 6: {
			System.out.println(" case 6 ran");
			break;
		}
		default: {
			System.out.println(" the default case ran. ");
			break;
		}
		case 7: { 
			System.out.println(" case 7 ran");
			break;
		}
		case 10: { 
			System.out.println(" case 10 ran");
		}
	}
		
  }
}
