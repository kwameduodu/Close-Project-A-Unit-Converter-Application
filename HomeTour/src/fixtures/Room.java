package fixtures;

public class Room extends Fixture {
	
	Room [] exist;
	
  public Room (String name, String shortDescription, String longDescription) {
	  super(longDescription, longDescription, longDescription);
	  
	  this.exist = new Room [3];
  }

  public Room [] getExists(){
	  
	return exist;
	  
  }
}
