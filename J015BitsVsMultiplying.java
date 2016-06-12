
/** The point of this program is to see time difference between 
* 	calculating k<<3 and k*8
* 	This program is not ready yet.
*/	

public class J015BitsVsMultiplying {
	
	static int valueOfElements = 5;
	static int numberOfElements = 20_000_000;
	static int i[] = new int[numberOfElements];
	
	public void makeValuesRight(int[]ii){
		int counter = 0;
		for(int value: ii){
			System.out.println("value77 before = " + value);
			value = new Integer(valueOfElements);
			if(counter<25){
				System.out.println("value77 after = " + value);
				counter++;
				if(counter == 25) System.exit(0);
			}			
		}		
	}
	
	public void shiftLeftByThree(int[]ii){
		for(int value: ii){
			value = value << 3;
			System.out.println("value before = " + value);
		
			boolean once = false;
			if(!once){
				System.out.println("value after = " + value);
				once = true;
				System.exit(0);
			}
		}
	}

	public static void main(String[] args) {
		
		J015BitsVsMultiplying bitsOption = new J015BitsVsMultiplying();
		bitsOption.makeValuesRight(i);
		bitsOption.shiftLeftByThree(i);
		System.out.println("done");
		
		
		
	}

}
