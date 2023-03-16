package JavaBasics;

public class StaticGlobalVariable_SC {
// StaticGlobalVariable are the variable declared outside method body.
//	These variables are declared using static keyword.
//	Can be called by variablename or classname.variablename .
	static int deposit = 3000;
	static char section = 'A';
	static String candidate = "Tejashree Telrandhe";
	static double rate = 8.5;
	
	public static void main(String[] args) {
		System.out.println("Initial deposit = "+deposit);
		System.out.println("Account section = "+section);
		System.out.println("Candidate name = "+candidate);
		System.out.println("Interest rate = "+rate);

	}

}
