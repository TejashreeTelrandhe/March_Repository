package ObjectOrientedProgramming;

public class MultiLevelInheritance_2 extends MultiLevelInheritance_1 {

	public static void main(String[] args) {
		MultiLevelInheritance_2 M2 = new MultiLevelInheritance_2();
		M2.tcs(); // MultiLevelInheritance_1
		M2.reliance(); // MultiLevelInheritance_1
		M2.wipro(); // MultiLevelInheritance_1
		M2.capgemini();
		M2.hcl();
		M2.cognizant();
	}

	public void hcl() {
		System.out.println("HCL : 14.30");
	}

	public void cognizant() {
		System.out.println("Cognizant : 31.05");
	}

	public void capgemini() {
		System.out.println("Capgemini : 50.20");
	}
}