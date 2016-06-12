
/** The point of this program is to see time difference between 
* 	calculating k<<3 and k*8
* 	This program is not ready yet.
*/	

public class J015CompareSpeed {
	
	static int valueOfElements = 5;
	int[] i = new int[50];

	public void fillArrayWithData(int[] i){
		for(int value: i){
			value = new Integer(valueOfElements);
		}
	}

	public static void main(String[] args) {
		
		J015CompareSpeed arrForBits = new J015CompareSpeed();
		arrForBits.fillArrayWithData(arrForBits.i);
		System.out.println("arrForBits.value15 = " + arrForBits.i[15]);
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


