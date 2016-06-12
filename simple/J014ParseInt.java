package simple;

public class J014ParseInt {
	public static void main(String[] args) {
		String[] str = {"45", "56", "67"};
		for(String i: str){
			Integer pp = Integer.parseInt(i, 16);
			System.out.println(pp);
		}
	}
}
