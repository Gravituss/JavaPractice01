package simple.initpriorities;

	
public class InitPrioParent { 
	
	static String st = "String of Super";
	// SIB = static init block
	static {
		System.out.println("SIB at Parent");
		System.out.println(st);
		
	}
	
	public InitPrioParent(){
		System.out.println("Constructor of Super");
	}
	
    public static void main(String[] args) { 
    		InitPrioChild child =  new InitPrioChild();
    		System.out.println(child.st);
    		System.out.println(st);
    } 
}

