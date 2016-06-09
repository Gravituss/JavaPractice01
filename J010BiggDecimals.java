import java.math.BigDecimal;

public class J010BiggDecimals {
	public static void main(String[] args){
		BigDecimal veryHugeNumber = new BigDecimal(Math.PI);
		System.out.println(veryHugeNumber);
		System.out.println("Only first 15 decimal points are fine"); 
	}
}
