package ObjectOrientedProgramming;

public class HierarchialInheritance_CC_1 extends HierarchialInheritance_PC {

	public static void main(String[] args) {
		HierarchialInheritance_CC_1 H2 = new HierarchialInheritance_CC_1();
		H2.Buy();// HierarchialInheritance_PC
		H2.Intraday();// HierarchialInheritance_PC
		H2.Longterm();// HierarchialInheritance_PC
		H2.Limit();
		H2.Market();
		H2.StopLoss();
	}

	public void Limit() {
		System.out.println("Quantity and price textbox enabled");
	}

	public void Market() {
		System.out.println("Quantity textbox enabled");
	}

	public void StopLoss() {
		System.out.println("Quantity, Price and Trigger price textbox");
	}
}
