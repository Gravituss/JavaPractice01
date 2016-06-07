public class J002Throw {

	public static void main(String[] args) {
		
		System.out.println(getAreaValue(-3, 10));
	}
	
	public static int getAreaValue(int a, int b){
		
		if (a < 0 || b < 0) throw new IllegalArgumentException("value of 'a'" +
				" or 'b' is negative: x="+a+", y="+b);
		return a*b; 
	}
}
