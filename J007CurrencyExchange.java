import java.util.Scanner;


public class J007CurrencyExchange {
	
	static String currFrom, currTo;
	static double amount;
	
	static double [] rateUsdUah = {25, 25.3};
	static double [] rateEurUah = {27, 27.8};
	
	public static void main(String[] args) {
		
		printRates();
		inputBlock();
		conversion();
		outputBlock();
	}
	
	public static void printRates(){
		System.out.printf("%-9s%-7s%-9s%n", "We buy", " ", "We sell");
		System.out.println("--------------------------");
		System.out.printf("%-9s%-7s%-9s%n", rateUsdUah[0] , "USD", rateUsdUah[1]);
		System.out.printf("%-9s%-7s%-9s%n", rateEurUah[0] , "EUR", rateEurUah[1]);
		System.out.println("--------------------------");
	}

	public static void inputBlock(){	
		
		System.out.println("Select the currency you have: UAH / USD / EUR");
		currFrom = scannerCurr();
		
		System.out.println("Specify the amount you wish to exchange, please:");
		amount = scannerAmount();
		
		System.out.println("Select the currency you want: UAH / USD / EUR");
		currTo = scannerCurr();	
	}	
	
	public static void outputBlock(){
		
		if(currFrom.equals(currTo)){
			System.out.println("Your currency is already fine");
		} else {
			System.out.print("You got ");
			System.out.printf("%.2f", amount);
			System.out.print(" " + currTo);
		}
	}
	
	public static void conversion(){
		if(currFrom.equals("UAH")){
			if(currTo.equals("USD")){
				amount = amount/rateUsdUah[1];
			}
			if(currTo.equals("EUR")){
				amount = amount/rateEurUah[1];
			}			
		}
		
		if(currFrom.equals("USD")){
			if(currTo.equals("UAH")){
				amount = amount*rateUsdUah[0];
			}
			if(currTo.equals("EUR")){
				amount = amount*rateUsdUah[0];
				amount = amount/rateEurUah[1];
			}			
		}		
		
		if(currFrom.equals("EUR")){
			if(currTo.equals("UAH")){
				amount = amount*rateEurUah[0];
			}
			if(currTo.equals("USD")){
				amount = amount*rateEurUah[0];
				amount = amount/rateUsdUah[1];				
			}				
		}		
	}

	public static String scannerCurr(){
		
		String inputCurrency;
		Scanner input = new Scanner(System.in);
		inputCurrency = input.nextLine().toUpperCase();
		
		if(inputCurrency.equals("UAH") ||
				inputCurrency.equals("USD") ||
				inputCurrency.equals("EUR")){return inputCurrency;}
		else {throw new IllegalArgumentException("Unknown currency. Pick one" +
				" of proposed options.");}
	}
	
	public static double scannerAmount(){
		
		String inputAmount;
		double value = 0;
		Scanner input = new Scanner(System.in);
		inputAmount = input.nextLine();
		
		try {value = Double.parseDouble(inputAmount);} 
			catch(IllegalArgumentException e) {System.out.println("Type a valid amount, please");}
		
		return value;
	}
}
