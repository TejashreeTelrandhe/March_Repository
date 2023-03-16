package ObjectOrientedProgramming;

public class SingleLevelInheritance_2 extends SingleLevelInheritance_1 {

	public static void main(String[] args) {
		SingleLevelInheritance_2 I2 = new SingleLevelInheritance_2();
		I2.Commodity(); // SingleLevelInheritance_1
		I2.Equity(); // SingleLevelInheritance_1
		I2.Holdings(); // SingleLevelInheritance_1
		System.out.println();
		I2.Wishlist();
		I2.Orders();
		I2.HoldingsPage();
	}

	public void Wishlist() {
		System.out.println("Nifty, Sensex");
	}

	public void Orders() {
		System.out.println("Orders,GTT,Baskets,SIP,Alerts,IPO,Auctions");
	}

	public void HoldingsPage() {
		System.out.println("Search,Authorisation,Family,Analytics,Download");
	}

}
