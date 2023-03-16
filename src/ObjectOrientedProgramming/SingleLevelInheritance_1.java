package ObjectOrientedProgramming;

public class SingleLevelInheritance_1 {

	public static void main(String[] args) {
		SingleLevelInheritance_1 I1 = new SingleLevelInheritance_1();
		I1.Equity();
		I1.Commodity();
		I1.Holdings();
	}

	public void Equity() {
		System.out.println("Equity Margin available, Opening balance");
	}

	public void Commodity() {
		System.out.println("Commodity Margin available, Opening balance");
	}

	public void Holdings() {
		System.out.println("Holdings Current value, Investment");
	}
}
