package four.Lab;

public class MethodDeclaration {
MethodOverloading hello;
String hi;
	public static void main(String[] args) {
		
		//create a class instance
		MethodDeclaration mdc = new MethodDeclaration(); //object
		//invoke a method
	     mdc.talk();	

	}
	// first method
	public void talk() {
		System.out.println("inside of the talk method");
	}
	
	public void setMethodDeclaration(MethodOverloading name) {
		 this.hello = name;
	
 }
	
	public MethodOverloading getMethodDeclaration() {
		return hello;
	}
}
