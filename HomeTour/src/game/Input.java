package game;

import java.util.Scanner;

import fixtures.Door;
import fixtures.Fixture;
import fixtures.Fridge;
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

		String[] strArr = input.split(" ");
		return strArr;
	
	}


	public static void parse(String[] command, Player player) {
	
		String action = command[0].intern();

		String details = null;

		if (command.length > 1) {
			details = command[1].toUpperCase().intern();
		}

		if (action.equalsIgnoreCase("Go") | action.equalsIgnoreCase("move")) {
			if (details != null) {
		
				movePlayer(details, player);
			} else {
				System.out.println("Enter a direction ");
			}
			
			
			
		} if (action.equalsIgnoreCase("Enter")) {
			
			if (details != null) {
				interactDoor(details, player);
			} else {
				System.out.println("Enter the right keyword: ");
			}
		}
			 if (action.equalsIgnoreCase("open")) {
					
					if (details != null) {
						interactFridge(details, player);
					} else {
						System.out.println("Enter the right keyword: ");
					}
					
		
		} if (action.equalsIgnoreCase("quit")) {
			Main.endGame();
		}
		
		
	}

	public static void movePlayer(String details, Player player) {
		System.out.println("You move: " + details);
		Room move = player.getCurrentRoom().getExit(details);
		player.setCurrentRoom(move);
	}

		public static void interactDoor(String details, Player player) {
		
			
			if (( player.getCurrentRoom().getItem()) != null) {
				
	Door dr = new Door("Door", "Maple Dale Front Door","solid wood with durable, double-paned tempered glass,perfect transition from outside to inside your home. ");
					dr.getInteract();
			}
			else {
				System.out.println("Can't interact with item");
			}
		
		}			
	public static void interactFridge(String details, Player player) {
								
						
						if (( player.getCurrentRoom().getItem()) != null) {
							
			
						Fridge fr = new Fridge("Fridge", "Stainless steel","A big emmpty fridge");
						fr.getInteract();
					}
					else {
						System.out.println("Can't interact with item");
					}
				}
			
		
		
		
}
