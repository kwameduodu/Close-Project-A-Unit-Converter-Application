package game;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
	System.out.println(" Hello! Wellcome to my crib /n Come on in");
		 Scanner sc = new Scanner (System.in);
		 
		 RoomManager rm = new RoomManager();
		 
		 Player player = new Player();
		 
		 Player.setCurrentlocation(rm.getFirstLocation);
		 
		 
		 String controls = sc.next();
		 
		
		 
		 
		

}
}