package fixtures;

public class Room extends Fixture {

	Room[] exits = new Room[4];
	
	Fixture[] items;
	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		
		
	}
	public Room[] getExit(){
		return exits;
		
	}
	
	
	public Room getExit(String direction) {
		
		int index = 0;
		
		direction = direction.toLowerCase().intern();
		
		switch(direction) {
		
		case "north":
			index = 0;
			break;
		case "south":
			index = 1;
			break;
		case "east":
				index = 2;
				break;
			case "west":
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
	
	public void setExits(Room exit, int index) {
		this.exits[index] = exit;
	}
	
	public Fixture[] getItems() {
		return items;
	}
 
	public void setItems(Fixture... items) {
		this.items= items;
	}
}

