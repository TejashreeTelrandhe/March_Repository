package TestNGFeatures;

import org.testng.annotations.Test;

public class keywords7 {

	// Excpetiontimeout
	@Test(timeOut = 10000)
	public void infiniteloop() {
		for (;;) {
			System.out.println("Hello");
		}
	}
}