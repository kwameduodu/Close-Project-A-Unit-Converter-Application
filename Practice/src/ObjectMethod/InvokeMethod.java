package ObjectMethod;

public class InvokeMethod {
	String name,  location;
	static secondInvoke i2;
	
	public InvokeMethod (String name, String location) {
		this.name = name;  
		this.location = location;
	}


	public static void main(String[] args) {
	
		
		InvokeMethod im = new InvokeMethod("kwame", "germantown");
		
		
		 i2 = new secondInvoke(im, "kwame");
	
		
		i2.setInvokeMethod(im);
		
		System.out.println(i2.getInvokeMethod().toString());
		
	im.letSeee(i2);
	 
	}
	@Override
	public String toString() {
		return "my name is " + name + ", I live at " + location;
	}
	
	public void letSeee (secondInvoke invoke) {
		
		System.out.println("This is why i want to get better " + name +" " +invoke.sc );
	}

}
	

