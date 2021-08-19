package game;

import fixtures.Fixture;
import fixtures.Interactable;
import fixtures.Room;

public class Main{

	static RoomManager manager = new RoomManager(4);
	 static boolean walking = true;
	public static void main(String[] args) {

		manager.init();
		
		Player player = new Player();
		
		System.out.println("Hello, Welcome to my house \n Open the door and come on in!" 
		+"\n let me show you around using North, south, east and west keyword");
		
		player.setCurrentRoom(manager.getStartingRoom());
	
		
		
		while(walking) {
			
			Input.printRoom(player);
			String[] input = Input.userInput();
			Input.parse(input, player);
		}

		if (!walking) {
			System.out.println("Thanks for playing");
		}
	}

	public static void endGame() {
		walking = false;
	}

		 
		 
	
	public static void printRoomExits(Player player) {
		System.out.println("Adjacent Rooms: ");
		
		Room[] connected = player.getCurrentRoom().getExit();
		
		
		for(int i = 0; i < connected.length; i++) {
			if (connected[i] != null) {
				switch (i) {
				case 0:  System.out.println("North");
					break;
				case 1: System.out.println("South");
					break;
				case 2: System.out.println("East");
					break;
				case 3: System.out.println("West");
					break;
				}
				
				System.out.println(connected[i].getName());
				 
			}
		}
	}
	
	public static void printIteractableObjects( Room room) {
		
		Fixture[] items = room.getItems();
		
		if(items != null && items.length > 0) {
			System.out.println("interactable items: ");
			for (Fixture i:items) {
				if(i instanceof Interactable) {
					System.out.println("\t"+i.getName());
				}
			}
		}
	}
}