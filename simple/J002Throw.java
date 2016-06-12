package simple;

public class J002Throw {

	public static void main(String[] args) {
		
		System.out.println(getAreaValue(-3, 10));
		System.out.println("Continuation of the code");
	}
	
	public static int getAreaValue(int a, int b){
		
		if (a < 0 || b < 0) throw new IllegalArgumentException("value of 'a'" +
				" or 'b' is negative: x="+a+", y="+b);
		return a*b; 
	}
}
