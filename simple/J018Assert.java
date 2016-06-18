package simple;

public class J018Assert {

	public static void main(String[] args) {
		boolean bb = true;
		assert !bb;
		assert (bb == false) : "false" ;
		System.out.println("it passed");
	}
}
