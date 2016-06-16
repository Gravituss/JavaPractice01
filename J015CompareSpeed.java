
/** The point of this program is to see time difference between 
* 	calculating k<<3 and k*8
* 	
*/	

public class J015CompareSpeed {
	
	static {
		System.out.println("Start");
	}
	
	static int valueOfElements = 5;
	static int numberOfElements = 20_000;
	static int additionalCycle = 4000;
	static long multiplyingTook, shiftingTook;

	int[] i = new int[numberOfElements];

	
	// Filling array of an instance of the class with values:
	public void fillArrayWithData(int[] i){
		for(int p = 0; p < i.length; p++){
			i[p] = new Integer(valueOfElements);
		}
	}
	
	/* Shifting all values of an array with the bitwise operator <<
	 * 	Additionally, this method is charged by using shiftLeftRight()
	 *  method (for the sake of increasing the delay):
	 */
	public void shiftLeft(int[] i){
		
		for(int p = 0; p < i.length; p++){
			
			for(int q = 1; q < additionalCycle; q++){
				i[p] = shiftLeftRight(i[p]);
			}
			
			i[p] = new Integer(i[p] << 3);			
		}		
	}
	
	/* This method uses 2 opposite shift bitwise operators
	 *  (for the sake of increasing the delay):
	 */
	
	public int shiftLeftRight(int j){

		j = new Integer(j << 3);
		j = new Integer(j >> 3);
		return j;
	}
	
	/* This method multiplies each value of an int[] array, but also
	 * this method is charged by multiplyAndDivide() method
	 * (for the sake of increasing the delay):
	 */
	
	public void multiply(int[] i){
		
		for(int p = 0; p < i.length; p++){
			
			for(int q = 1; q < additionalCycle; q++){
				i[p] = multiplyAndDivide(i[p]);
			}			
						
			i[p] = new Integer(i[p] * 8);
		}		
	}
	
	/* This method uses 2 opposite operations: multiplying and
	 * dividing, which gives the same value in result, but 
	 * increases the delay: 
	 */
	public int multiplyAndDivide(int j){
		
		j = new Integer(j * 8);
		j = new Integer(j / 8);
		return j;
	}
	
	// This method prints the result of our research
	public static void outcome(){
		
		double multiplyingD = multiplyingTook;
		double shiftingD = shiftingTook;
		
		if(multiplyingTook >= shiftingTook){
			System.out.print("Shifting was faster by ");
			System.out.printf("%.3f", 100*(-1 + multiplyingD/shiftingD));
			System.out.print(" %");
		} else {
			System.out.printf("Multiplying was faster by ");
			System.out.printf("%.3f", 100*(-1 + shiftingD/multiplyingD));
			System.out.print(" %");
		}
	}
	
	public static void main(String[] args) {
		
		// We instantiate 2 objects of the class
		J015CompareSpeed arrForBits = new J015CompareSpeed();
		J015CompareSpeed arrForMultiplying = new J015CompareSpeed();
		
		// We fill array of each object with data
		arrForBits.fillArrayWithData(arrForBits.i);
		arrForMultiplying.fillArrayWithData(arrForMultiplying.i);
		
		final long BEFORE_OPERATIONS = System.currentTimeMillis();

		// Bitwise shifting:
		System.out.println("Start shifting...");
		arrForBits.shiftLeft(arrForBits.i);
		
		shiftingTook = System.currentTimeMillis() - BEFORE_OPERATIONS;
		
		// Multiplying:
		System.out.println("Start multiplying...");
		arrForMultiplying.multiply(arrForMultiplying.i);
		
		// Outcome
		multiplyingTook = System.currentTimeMillis() - BEFORE_OPERATIONS - shiftingTook;
		System.out.printf("%-25s%-7s%-4s%n", "Bitwise shifting took:", shiftingTook, " ms");
		System.out.printf("%-25s%-7s%-4s%n", "Multiplying took:", multiplyingTook, " ms");
		
		outcome();
	}
}	







