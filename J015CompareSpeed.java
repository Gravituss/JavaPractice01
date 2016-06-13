
/** The point of this program is to see time difference between 
* 	calculating k<<3 and k*8
* 	This program is not ready yet.
*/	

public class J015CompareSpeed {
	
	static {
		System.out.println("Start");
	}
	
	static int valueOfElements = 5;
	static int numberOfElements = 20_000;
	static long [] additionalCycle = {200, 201};

	int[] i = new int[numberOfElements];

	

	public void fillArrayWithData(int[] i){
		for(int p = 0; p < i.length; p++){
			i[p] = new Integer(valueOfElements);
		}
	}
	
	public void shiftLeft(int[] i){
		
		for(int p = 0; p < i.length; p++){
			
			for(long q = 1; q < additionalCycle[0]; q++){
				i[p] = shiftLeftRight(i[p]);
	
				for(long qq = 1; qq < additionalCycle[1]; qq++){
					i[p] = shiftLeftRight(i[p]);				
				}
			}
			
			i[p] = new Integer(i[p] << 3);			
		}		
	}
	
	public int shiftLeftRight(int j){

		j = new Integer(j << 3);
		j = new Integer(j >> 3);
		return j;
	}
	
	public void multiply(int[] i){
		
		for(int p = 0; p < i.length; p++){
			
			for(long q = 1; q < additionalCycle[0]; q++){
				i[p] = multiplyAndDivide(i[p]);
				for(long qq = 1; qq < additionalCycle[1]; qq++){
					i[p] = multiplyAndDivide(i[p]);					
				}				
			}			
						
			i[p] = new Integer(i[p] * 8);
		}		
	}
	
	public int multiplyAndDivide(int j){
		
		j = new Integer(j * 8);
		j = new Integer(j / 8);
		return j;
	}

	public static void main(String[] args) {
		
		
		
		J015CompareSpeed arrForBits = new J015CompareSpeed();
		arrForBits.fillArrayWithData(arrForBits.i);

		
		
		
		
		
		J015CompareSpeed arrForMultiplying = new J015CompareSpeed();
		arrForMultiplying.fillArrayWithData(arrForMultiplying.i);

		
		
		
		
		
		System.out.println("arrForBits.value15 = " + arrForBits.i[15]);
		System.out.println("arrForMultiplying.value15 = " + arrForMultiplying.i[15]);
	}
}	






//	public void shiftLeftByThree(int[]ii){
//	for(int value: ii){
//		value = value << 3;
//		System.out.println("value before = " + value);
//	
//		boolean once = false;
//		if(!once){
//			System.out.println("value after = " + value);
//			once = true;
//			System.exit(0);
//		}
//	}
//}	
//	static int numberOfElements = 20_000_000;	


