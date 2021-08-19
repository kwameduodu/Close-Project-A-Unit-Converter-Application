package fixtures;

public class Room extends Fixture {
	
	
	Room north, south, east, west;
	Room [] connection;
	
  public Room (String name, String shortDescription, String longDescription) {
	  super(longDescription, longDescription, longDescription);
  }

  
  

public Room getConnectedRoom(String direction) {
   if (direction == "north")
	   return connection[0];
}



  public Room moveForward() {
	  return this.north;
  }
  
  public Room moveBack() {
	  return this.south;
  }
  
  public Room moveLeft(){
	  return this.west;
  }
  
  public Room moveRight() {
	  return.east;
  }
  
  public void setUp(Room up) {
	  return this.north
  }
  
  public void setDown(Room down) {
	  return this.south
  }
  
  public void setLeft(Room left) {
	  return this.west
  }
  public void setRight(Room right) {
	  return this.east
  }
   
}

