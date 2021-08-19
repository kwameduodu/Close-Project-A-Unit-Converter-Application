package game;

import fixtures.Room;

public class RoomManager {

	Room [] rooms;
	Room firstRoom;
	
	
	public void init() {
		Room livingRoom = new Room(
				"The living Room",
				"Family size living room",
				"The small entryway of a neo-colonial house. A dining room is open to the south, where a large table can be seen." + "\n"
						+ "The hardwood floor leads west into doorway, next to a staircase that leads up to a second floor." + "\n"
						+ "To the north is a small room, where you can see a piano.");
		this.rooms[0] = livingRoom;
		


		Room kitchen = new Room(
				"The living Room",
				"Family size living room",
				"The small entryway of a neo-colonial house. A dining room is open to the south, where a large table can be seen." + "\n"
						+ "The hardwood floor leads west into doorway, next to a staircase that leads up to a second floor." + "\n"
						+ "To the north is a small room, where you can see a piano.");
		this.rooms[1] = kitchen;
				
		
		Room bedRoom = new Room(
				"The living Room",
				"Family size living room",
				"The small entryway of a neo-colonial house. A dining room is open to the south, where a large table can be seen." + "\n"
						+ "The hardwood floor leads west into doorway, next to a staircase that leads up to a second floor." + "\n"
						+ "To the north is a small room, where you can see a piano.");
		this.rooms[2] = bedRoom;
		
		
		Room bathRoom = new Room(
				"The living Room",
				"Family size living room",
				"The small entryway of a neo-colonial house. A dining room is open to the south, where a large table can be seen." + "\n"
						+ "The hardwood floor leads west into doorway, next to a staircase that leads up to a second floor." + "\n"
						+ "To the north is a small room, where you can see a piano.");
		this.rooms[3] = bathRoom;
		
		livingRoom.setUp(livingRoom);
		livingRoom.setDown(bedRoom);
		livingRoom.setLeft(kitchen);
		livingRoom.setRight(bathRoom);

      firstRoom = livingRoom;
	}
	
	public Room getFirstRoom() {
		return firstRoom;
	}
}
