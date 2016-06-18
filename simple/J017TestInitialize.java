package simple;

public class J017TestInitialize { 
	public J017TestInitialize(){
		System.out.println("constructor");
	}
	public static void main(String[] args) {
		new J017TestInitialize();
		new J017TestInitialize();
	}
} 