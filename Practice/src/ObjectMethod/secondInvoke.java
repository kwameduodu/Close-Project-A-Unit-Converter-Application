package ObjectMethod;

public class secondInvoke {
	InvokeMethod sc;
	String names;
	public secondInvoke(InvokeMethod sc ,String name) {
		this.names= name;
		this.sc = sc;
		
		System.out.println("this is so great, My name is " + name +". In case you did hear me, I said "+sc);
	}
	


	public void setInvokeMethod(InvokeMethod message) {
		this.sc=message;
	}
	
	public InvokeMethod getInvokeMethod() {
		return sc;
	}
}
