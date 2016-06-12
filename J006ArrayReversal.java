
public class J006ArrayReversal {

	// This program reverses arrays initialized in the main method 
	// and prints both initial and reversed arrays in pairs:
	public static void main(String[] args) {
		
		int array [] = null;
		int array2 [] = new int[]{};
		int array3 [] = new int[]{8};
		int array4 [] = new int[]{3, 88, -55};
		int array5 [] = new int[]{4, 0, 5, 444};
		
		arrayReverse(array, array2, array3, array4, array5);
	}
	
	// This method reverses arrays given as arguments and prints arrays
	// with the help of printArray() method realized after this method:
	public static void arrayReverse(int[]... a){
		
		for (int[] arr: a){
			if (arr == null){
				System.out.println("null --> null");
				continue;
			} else{
				int len = arr.length;
				printArray(arr);
				for (int i = 0; i < len ; i++ ){
					if (i < len/2){
						int tmp = arr[i];
						arr[i] = arr[len-i-1];
						arr[len-i-1] = tmp;
					}
				}
				System.out.print(" --> ");
				printArray(arr);
				System.out.println("");
			}
		}
	}
	
	// This method prints given array by template {7, 8, 9, 10}
	public static void printArray(int[] arr){
		
		System.out.print("{");		
		for(int i = 0; i < arr.length ; i++){
			if (i < arr.length-1)System.out.print(arr[i] + ", ");
			if (i == arr.length-1)System.out.print(arr[i]);
		}
		System.out.print("}");		
	}
}
