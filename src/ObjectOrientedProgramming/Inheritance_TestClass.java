package ObjectOrientedProgramming;

public class Inheritance_TestClass {

	public static void main(String[] args) {
		System.out.println("Single Level Inheritance");
		SingleLevelInheritance_1 I1 = new SingleLevelInheritance_1();
		I1.Equity();
		I1.Commodity();
		I1.Holdings();
		System.out.println();

		SingleLevelInheritance_2 I2 = new SingleLevelInheritance_2();
		I2.Commodity(); // SingleLevelInheritance_1
		I2.Equity(); // SingleLevelInheritance_1
		I2.Holdings(); // SingleLevelInheritance_1
		I2.Wishlist();
		I2.Orders();
		I2.HoldingsPage();
		System.out.println();

		System.out.println("Multi Level Inheritance");
		MultiLevelInheritance_1 M1 = new MultiLevelInheritance_1();
		M1.wipro();
		M1.tcs();
		M1.reliance();
		System.out.println();

		MultiLevelInheritance_2 M2 = new MultiLevelInheritance_2();
		M2.tcs(); // MultiLevelInheritance_1
		M2.reliance(); // MultiLevelInheritance_1
		M2.wipro(); // MultiLevelInheritance_1
		M2.capgemini();
		M2.hcl();
		M2.cognizant();
		System.out.println();

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
		System.out.println();

		System.out.println("Hierarchial Inheritance");
		HierarchialInheritance_PC H1 = new HierarchialInheritance_PC();
		H1.Buy();
		H1.Intraday();
		H1.Longterm();
		System.out.println();
		
		HierarchialInheritance_CC_1 H2 = new HierarchialInheritance_CC_1();
		H2.Buy();// HierarchialInheritance_PC
		H2.Intraday();// HierarchialInheritance_PC
		H2.Longterm();// HierarchialInheritance_PC
		H2.Limit();
		H2.Market();
		H2.StopLoss();
		System.out.println();
		
		HierarchialInheritance_CC_2 H3 = new HierarchialInheritance_CC_2();
		H3.Buy();// HierarchialInheritance_PC
		H3.Intraday();// HierarchialInheritance_PC
		H3.Longterm();// HierarchialInheritance_PCH3.Cover();
		H3.Iceberg();
		H3.MarketStopLoss();
	}

}
