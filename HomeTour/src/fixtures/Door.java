package fixtures;

public class Door extends Fixture implements Interactable {

	public Door(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		
	}

	public void interact() {
		System.out.println("The door is open, Come on in!!");
	}

}
