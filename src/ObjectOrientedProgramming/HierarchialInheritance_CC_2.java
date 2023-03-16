package ObjectOrientedProgramming;

public class HierarchialInheritance_CC_2 extends HierarchialInheritance_PC {

	public static void main(String[] args) {
		HierarchialInheritance_CC_2 H3 = new HierarchialInheritance_CC_2();
		H3.Buy();// HierarchialInheritance_PC
		H3.Intraday();// HierarchialInheritance_PC
		H3.Longterm();// HierarchialInheritance_PCH3.Cover();
		H3.Iceberg();
		H3.MarketStopLoss();
	}

	public void MarketStopLoss() {
		System.out.println("Quantity and Trigger price textbox");
	}

	public void Cover() {
		System.out.println("Quantity and Stoploss Trigger price textbox");
	}

	public void Iceberg() {
		System.out.println("Quantity and Number of legs textbox");
	}
}
