
public class J012StringString {
	public static void main(String[] args) {

		String[][]string = {{"String11" , "String21"}, {"String31", "String41", "String41"} };
			for(String[] st: string){
				System.out.println(st);
				for(String st2: st){
					System.out.println(st2);
				}
			}
	}
}
