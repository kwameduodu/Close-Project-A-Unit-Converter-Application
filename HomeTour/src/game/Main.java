package game;

import fixtures.Fixture;

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

		 
		 
	
	public static void printRoomExits(Player player ) {
		System.out.print("Adjacent room is ");
		
		Room[] connected = player.getCurrentRoom().getExit();
		
		
		for(int i = 0; i < connected.length; i++) {
			if (connected[i] != null) {
				switch (i) {
				case 0:  System.out.print("north ");
					break;
				case 1: System.out.print("south ");
					break;
				case 2: System.out.print("west ");
					break;
				case 3: System.out.print("east ");
					break;
				}
			System.out.println(connected[i].getName());
				 
			}
		}
	}
	
	public static void printIteractableObjects( Room room) {
		
		Fixture[] items = room.getItem();
		
		if(items != null && items.length > 0) {
			System.out.println("interactable items: ");
			for (Fixture i:items) {
				
					System.out.println("\t"+i.getName());
				
			}
		}
	}
}