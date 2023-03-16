package JavaBasics;

public class StaticGlobalVariable_DC {
static String bank = "Union bank";
static String branch ="Umred";
	public static void main(String[] args) {
		System.out.println("Initial deposit = "+StaticGlobalVariable_SC.deposit);
		System.out.println("Account section = "+StaticGlobalVariable_SC.section);
		System.out.println("Candidate name = "+StaticGlobalVariable_SC.candidate);
		System.out.println("Interest rate = "+StaticGlobalVariable_SC.rate);
		
		System.out.println();
		System.out.println("Bank name = "+bank);
		System.out.println("Branch name = "+branch);

	}

}
