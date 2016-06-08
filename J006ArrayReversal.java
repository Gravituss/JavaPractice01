
public class J006ArrayReversal {

	public static void main(String[] args) {
		
		int array [] = new int[]{1, 5, 77, 9, 99};
		int array2 [] = new int[]{};
		int array3 [] = new int[]{8};
		int array4 [] = new int[]{3, 88, 55};
		
		arrayRev(array, array2, array3, array4);
	}

	public static void arrayRev(int[]... a){
		
		for (int[] mas: a){
			int len = mas.length;
			printArray(mas);
			for (int i = 0; i < len ; i++ ){
				if (i < len/2){
					int tmp = mas[i];
					mas[i] = mas[len-i-1];
					mas[len-i-1] = tmp;
				}
			}
			System.out.print(" --> ");
			printArray(mas);
			System.out.println("");
		}
	}
	
	public static void printArray(int[] arr){
		
		System.out.print("{");		
		for(int i = 0; i < arr.length ; i++){
			if (i < arr.length-1)System.out.print(arr[i] + ", ");
			if (i == arr.length-1)System.out.print(arr[i]);
		}
		System.out.print("}");		
	}

}
