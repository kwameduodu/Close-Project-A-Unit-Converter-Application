package fixtures;

public class Room extends Fixture {

	Room[] exits = new Room[4];
	
	Fixture[] item;
	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		
		
	}
	public Room[] getExit(){
		return exits;
		
	}
	
	
	public Room getExit(String direction) {
		
		int index = 0;
		
		direction = direction.toUpperCase();
		switch (direction) {
		case "NORTH":
			index = 0;
			break;
		case "SOUTH":
			index = 1;
			break;
		case "WEST":
			index = 2;
			break;
		case "EAST":
			index = 3;
			break;			
		}
		
		if(index >=this.exits.length || this.exits[index] ==null) {
			System.out.println("There is no room left");
			
			return this;
		}
		
		return this.exits[index];
	}
	
	
	public void setExits(Room [] exits) {
		this.exits = exits;
		
	}
	
	public void setExits(int index, Room exit) {
		this.exits[index] = exit;
	}
	
	public Fixture[] getItem() {
		return item;
	}
 
	public void setItems(Fixture... item) {
		this.item= item;
	}
}

