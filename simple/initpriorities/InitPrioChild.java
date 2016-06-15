package simple.initpriorities;

public class InitPrioChild extends InitPrioParent {
	
	static String st = "String at Child";
	// SIB = static init block
	static {
		System.out.println("SIB at Child");
		System.out.println(st + " at child");
	}
	
	public InitPrioChild(){
		System.out.println("Constructor of Child");
	}	
	
    public static void main(String[] args) { 
		InitPrioChild child =  new InitPrioChild();
		System.out.println(child.st);
		System.out.println(st);
    } 
	
}
