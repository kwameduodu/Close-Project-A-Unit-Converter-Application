package game;

import java.util.Scanner;

import fixtures.Fixture;
import fixtures.Interactable;
import fixtures.Room;

public class Input {

	public static void printRoom(Player player) {
		System.out.println("CURRENT ROOM");
		System.out.println("Name: " + player.getCurrentRoom().getName());
		System.out.println("Short Desc: " + player.getCurrentRoom().getShortDescription());
		System.out.println("Long Desc: " + player.getCurrentRoom().getLongDescription());
		
		Main.printRoomExits(player);
		Main.printIteractableObjects(player.getCurrentRoom());
	}

	
	public static String[] userInput() {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();

		String[] phrase = input.split(" ");
		return phrase;
	
	}


	public static void parse(String[] command, Player player) {
	
		String action = command[0].toLowerCase().intern();

		String details = null;

		if (command.length > 1) {
			details = command[1].toLowerCase().intern();
		}

		if (action == "GO" | action == "MOVE") {
			if (details != null) {
		
				movePlayer(details, player);
			} else {
				System.out.println("Enter a direction");
			}
		} if (action == "INTERACT") {
			
			if (details != null) {
				objectInteraction(details, player);
			} else {
				System.out.println("Enter an item name");
			}
		} else if (action == "QUIT") {
			Main.endGame();
		}
		
		
	}

	public static void movePlayer(String details, Player player) {
		System.out.println("You try to move: " + details);
		
		
		Room move = player.getCurrentRoom().getExit(details);
		player.setCurrentRoom(move);
	}

	
	public static void objectInteraction(String details, Player player) {
		Fixture[] items = null;
		if ((items = player.getCurrentRoom().getItems()) != null) {
			for (Fixture i : items) {
				if (i.getName().equalsIgnoreCase(details) & (i instanceof Interactable)) {
					((Interactable) i).interact();
				} else {
					System.out.println("Item not found");
				}
			}
		} else {
			System.out.println("No Items to interact with");
		}
		
		

	}
}