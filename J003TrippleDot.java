
public class J003TrippleDot {
	
	public static void main(String[] args) {
		
		int sum = getSumOfSeveralInts(1, 10, 100);
		System.out.println("Our sum is: " + sum);
	}
	
	public static int getSumOfSeveralInts (int... a){
		
		int sum = 0;
		for (int var: a){
			sum += var;
		}
		return sum;
	}
}
