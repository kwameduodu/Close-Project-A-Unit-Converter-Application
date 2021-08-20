package fixtures;

public class Fridge extends Fixture {

	public Fridge(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		
	}
	public void getInteract() {
		System.out.println("The fridge is empty. ");
	}
}