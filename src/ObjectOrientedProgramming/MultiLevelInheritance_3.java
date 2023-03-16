package ObjectOrientedProgramming;

public class MultiLevelInheritance_3 extends MultiLevelInheritance_2 {

	public static void main(String[] args) {
		MultiLevelInheritance_3 M3 = new MultiLevelInheritance_3();
		M3.reliance();// MultiLevelInheritance_1
		M3.tcs();// MultiLevelInheritance_1
		M3.wipro();// MultiLevelInheritance_1
		M3.capgemini();// MultiLevelInheritance_2
		M3.cognizant();// MultiLevelInheritance_2
		M3.hcl(); // MultiLevelInheritance_2
		M3.intuit();
		M3.talentica();
		M3.xoriant();
	}

	public void talentica() {
		System.out.println("Talentica : 9.30");
	}

	public void xoriant() {
		System.out.println("Xoriant : 6.05");
	}

	public void intuit() {
		System.out.println("Intuit : 5.20");
	}
}
