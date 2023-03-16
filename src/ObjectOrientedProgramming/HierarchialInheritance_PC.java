package ObjectOrientedProgramming;

public class HierarchialInheritance_PC {

	public static void main(String[] args) {
		HierarchialInheritance_PC H1 = new HierarchialInheritance_PC();
		H1.Buy();
		H1.Intraday();
		H1.Longterm();
	}

	public void Buy() {
		System.out.println("Regular,Cover,AMO,Iceberg");
	}

	public void Intraday() {
		System.out.println("Quantity textbox");
	}

	public void Longterm() {
		System.out.println("Trigger price textbox");
	}
}
