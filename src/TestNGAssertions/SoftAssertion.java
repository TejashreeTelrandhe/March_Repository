package TestNGAssertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {

	SoftAssert soft = new SoftAssert();

	@Test
	public void DemoTest() {

		soft.assertEquals("Welcome", "Welcome");
		System.out.println("Execution Started");

		soft.assertEquals("Selenium", "Seleniu"); // false

		System.out.println("Successfully passed DemoTest");

		soft.assertAll();

//It collect the result of all the assertion and in case of any failure mark the test as failed
	}

	@Test
	public void DemoTest2() {
		soft.assertEquals("Welcome", "Welcome"); // True
		System.out.println("Execution Started");

		soft.assertTrue(false);

		soft.assertEquals(false, true); // false

		soft.assertEquals("Selenium", "Seleniu"); // false

		System.out.println("Successfully passed DemoTest");

		soft.assertAll();
	}
}