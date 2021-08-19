package tour;

import java.util.Scanner;

public class Rooms {

	public static void main(String[] args) {
		
		System.out.println("Welcome!! Please open the door and come inside");
		
		Scanner sc = new Scanner(System.in);
		
		String user = sc.nextLine();
		
	
		
		

		
		switch(user) {
				
		case "open door": 
			
		System.out.println("Open door. Feel free to look around");
		
		System.out.println("Current location");
		
		break;
		
		case  "move east":
			
			System.out.println("kitchen");
		break;
		
		case "leave":
			
			System.out.println("Thank you for coming");
			break;
		}
	
		
		if(sc !=null) {
			sc.close();
			}
		
		
		
		}
	}
