package TestNGFeatures;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNgEmailablReport {

	@Test
	public void orangeHRMTest() {
		System.out.println("@Test --OraneHRMTest");
		
		Reporter.log("Running OrangeHRM Test",true);
		
	}
	
	@Test
	public void orangeHRMsearch() {
		System.out.println("@Test --OraneHRMsearch");
		Reporter.log("Search Test passed",true);
	}
}