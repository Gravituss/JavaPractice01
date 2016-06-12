package simple;

public class J001StaticInitBlock {

	private static int i;

	static {
		i = 5;
	}

	public static void main(String[] args) {
		System.out.println("i = " + i);
	}

}
