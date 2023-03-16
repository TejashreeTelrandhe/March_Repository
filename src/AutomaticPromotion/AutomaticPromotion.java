package AutomaticPromotion;

public class AutomaticPromotion {

	public static void main(String[] args) {
		
		AutomaticPromotion AP =new AutomaticPromotion();
		AP.m1();
		AP.m1(10);
		AP.m1(1244.3f);
		AP.m1('A');

	}
	public void m1() {
		
		System.out.println("Zero i/p para method");
	}

	public void m1(double d) {
		System.out.println("Double argument method");
		
	}
	
	
	
}