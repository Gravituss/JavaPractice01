package simple;

public class J009ArrayCopy {

	public static void main(String[] args) {
		
		int [] a = {3, 5, 7};
		int [] b = {1, 2, 3}; 
		
		System.arraycopy(a, 0, b, 0, 3);
		for(int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}
		System.out.println("");
		for(int i = 0; i < b.length; i++){
			System.out.println(b[i]);
		}
	}
}
