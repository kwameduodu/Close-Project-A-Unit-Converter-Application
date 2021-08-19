package game;

import fixtures.Room;
import fixtures.Door;

public class RoomManager {
	Room [] rooms;

	Room startingRoom;
	public RoomManager(int roomCount) {
		super();
		rooms = new Room[roomCount];
	}

	
	
	public void init() {
		Room outside = new Room("Outside","Front door","Standing in front of the house with the door closed");
		this.rooms[0] = outside;


		Room livingRoom = new Room("Living room","Small size living room", "Small size family room with tv mounted on the wall");
		this.rooms[1] = livingRoom;
				
		
		Room kitchen = new Room("kitchen","medium size kitchen","  The kitchen has dark brown cabinets with two double doors. These cabinets are filled with dishes, cups and bowls on one side and spices along with a box .");
		this.rooms[2] = kitchen;
		
		
		Room bathRoom = new Room("The bathroom","main bathroom", "The bathroom contain a bathtub and a sink and toilet");
		this.rooms[1] = livingRoom;
		this.rooms[3] = bathRoom;
		
		this.startingRoom = outside;
		
		Room[] outsideExits = { livingRoom, kitchen};
		
		outside.setExits(outsideExits);
		livingRoom.setExits(outside, 1);
		livingRoom.setExits(bathRoom, 0);
		bathRoom.setExits(outside, 3);
		kitchen.setExits(outside, 2);
		
		outside.setItems(new Door("Door", "Maple Dale Front Door","solid wood with durable, double-paned tempered glass,perfect transition from outside to inside your home. "));
	}
	
	
	public Room getStartingRoom() {
		return this.startingRoom;
	}
	
	public void setStartingRoom(Room startingRoom) {
		this.startingRoom = startingRoom;
	}
	
	public Room[] getRooms() {
		return this.rooms;
	}
	
	public void setRooms(Room[] rooms) {
		this.rooms=rooms;
	}
}
		
