package simple;

public class J020HashC {

	Integer inn = 45_000_000;
	
	public static void main(String[] args) {
		
		J020HashC objectJ = new J020HashC();
		System.out.println(objectJ.hashCode());
		System.out.println(objectJ.inn.hashCode());
	}
}
