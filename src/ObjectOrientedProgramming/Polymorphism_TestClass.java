package ObjectOrientedProgramming;

public class Polymorphism_TestClass {

	public static void main(String[] args) {
		MethodOverriding_PC MO1 = new MethodOverriding_PC();
		MO1.buy();// Iceberg, AMO, Cover, Regular
		MO1.sell();// NSE, BSE
		MO1.ordertype();// Market, Stoploss, Limit, Market Stoploss
		MO1.dashboard();// Commodity statements
		System.out.println();

		MethodOverriding_CC MO2 = new MethodOverriding_CC();
		MO2.buy();// Regular option selected
		MO2.sell();// NSE selected
		MO2.ordertype();// Order type - select only one option
		MO2.validity();// Day, Immediate, Minutes
		MO2.dashboard();// Equity statements
		System.out.println();

		MethodOverriding_PC MO = new MethodOverriding_CC();// Upcasting

		MO.buy();// Regular option selected
		MO.sell();// NSE selected
		MO.ordertype();// Order type - select only one option
		MO.dashboard();// Commodity statements

		/*
		 * Non-Static Methods present in parent class are overridded in child class
		 * method definitions is changed, but static method not overridded as method
		 * definition remained same.
		 */

	}

}
