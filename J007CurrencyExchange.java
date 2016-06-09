import java.util.Scanner;


public class J007CurrencyExchange {
	
	static String currFrom, currTo;
	static double amount;
	
	static double [] rate_usd_uah = {25, 25.3};
	static double [] rate_eur_uah = {27, 27.8};
	
	public static void main(String[] args) {
		
		inputBlock();
		
		conversion();

		outputBlock();
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
		
		int amountInt = (int) (amount*100);
		String amountStr = String.valueOf(amountInt);
		
		amountStr = amountStr.substring(0, (amountStr.length() - 2)) + "." + 
				amountStr.substring(((amountStr.length()) - 2), amountStr.length());
		
		if(currFrom.equals(currTo)){
			System.out.println("Your currency is already fine");
		} else {
			System.out.println("You got " + amountStr +
					 " " + currTo);
		}
	}
	
	public static void conversion(){
		if(currFrom.equals("UAH")){
			if(currTo.equals("USD")){
				amount = amount/rate_usd_uah[1];
			}
			if(currTo.equals("EUR")){
				amount = amount/rate_eur_uah[1];
			}			
		}
		
		if(currFrom.equals("USD")){
			if(currTo.equals("UAH")){
				amount = amount*rate_usd_uah[0];
			}
			if(currTo.equals("EUR")){
				amount = amount*rate_usd_uah[0];
				amount = amount/rate_eur_uah[1];
			}			
		}		
		
		if(currFrom.equals("EUR")){
			if(currTo.equals("UAH")){
				amount = amount*rate_eur_uah[0];
			}
			if(currTo.equals("USD")){
				amount = amount*rate_eur_uah[0];
				amount = amount/rate_usd_uah[1];				
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
