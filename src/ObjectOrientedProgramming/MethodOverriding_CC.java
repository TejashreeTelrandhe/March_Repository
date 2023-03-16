package ObjectOrientedProgramming;

public class MethodOverriding_CC extends MethodOverriding_PC {

	public static void main(String[] args) {
	MethodOverriding_CC MO2 = new MethodOverriding_CC();
	MO2.buy();
	MO2.sell();
	MO2.ordertype();
	MO2.validity();
	MO2.dashboard();
	}
	public static void dashboard() {
		System.out.println("Equity statements");
	}
	public void buy() {
		System.out.println("Regular option selected");
	}

	public void sell() {
		System.out.println("NSE selected");
	}

	public void ordertype() {
		System.out.println("Order type - select only one option");
	}
	public void validity() {
		System.out.println("Day, Immediate, Minutes");
	}
}
