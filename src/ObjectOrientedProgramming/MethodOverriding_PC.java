package ObjectOrientedProgramming;

public class MethodOverriding_PC {

	public static void main(String[] args) {
		MethodOverriding_PC MO1 = new MethodOverriding_PC();
		MO1.buy();
		MO1.sell();
		MO1.ordertype();
		MO1.dashboard();
		
	}
	public static void dashboard() {
		System.out.println("Commodity statements");
	}
	public void buy() {
		System.out.println("Iceberg, AMO, Cover, Regular");
	}

	public void sell() {
		System.out.println("NSE, BSE");
	}

	public void ordertype() {
		System.out.println("Market, Stoploss, Limit, Market Stoploss");
	}
	
}
