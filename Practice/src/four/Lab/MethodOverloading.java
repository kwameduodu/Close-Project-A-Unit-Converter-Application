package four.Lab;

public class MethodOverloading {
	String name;
	int age;

	public MethodOverloading () {
	
	}
	
	
	
	public static void main(String[] args) {
	
		MethodDeclaration dr = null;
		// Calling the methodDeclaration class
		dr = new MethodDeclaration();
		MethodOverloading hello = new MethodOverloading();
		
		hello.age = 23;
		hello.name = "kwame";
		MethodOverloading hl = new MethodOverloading();
		//invoke talk method
dr.setMethodDeclaration(hello);
		

     System.out.println(dr.getMethodDeclaration().toString());
     
     dr.setMethodDeclaration(hl);
     System.out.println(dr.getMethodDeclaration().toString());
		//methodOverloading class instance
		


	
		//calling getMethod
		
		
		
		
//		//invoke method
//		mo.print();
//		//second method invoke
//		mo.print("second print method");
//		//third method
//		mo.print("third and", " fourth print method");
//		
//		//return method
//		double d = mo.convertIntToDouble(34);
//		System.out.println(d);
//		
//		//return boolean value
//		System.out.println("the value of b is: " + mo.returnBoolean());
//	}
//	//overloading method
//	public void print() {
//		System.out.println("original print method");
//	}
//	
//	public void print(String str) {
//		System.out.println(str);
//	}
//	public void print (String str, String str2) {
//		System.out.println(str + str2);
//		
//	
//	}
//	
//	public double convertIntToDouble(int num) {
//		return (double)num;
//	}
//	public boolean returnBoolean() {
//		return true;
//	}
	}



	@Override
	public String toString() {
		return "My name is " + name + ", and age is " + age ;
	}
	

}
