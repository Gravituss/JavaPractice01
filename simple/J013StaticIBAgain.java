package simple;

public class J013StaticIBAgain {
	
	static {
		System.out.println("Static Init Block - run once");
	}	
	int i;
	
	public static void main(String[] args) {
		
		System.out.println("----------");
		J013StaticIBAgain a = new J013StaticIBAgain();
		J013StaticIBAgain b = new J013StaticIBAgain();
		a.i = 5;
		b.i = 7;
		
		System.out.println("i = " + a.i);
		System.out.println("i = " + b.i);
	}
}
