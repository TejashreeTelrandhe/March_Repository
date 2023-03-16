package TestNG_Annotations;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

public class Annotations_1 {
	@BeforeSuite
	public void Beforesuite() {
		System.out.println("Annotated method will run only once before all tests in this suite have run");
	}

	@BeforeTest
	public void Beforetest() {
		System.out.println(
				"Annotated method will run before any test method belonging to class inside <test> tag is run");
	}

	@BeforeClass
	public void Beforeclass() {
		System.out.println("Annotated method will run only once before first test method in current class is invoked");

	}

	@BeforeMethod
	public void Beforemethod() {
		System.out.println("Annotated method will run before each test method");
	}

	@Test
	public void test1() {
		System.out.println("Annotated method will execute test method : test1");
	}

	@Test
	public void test2() {
		System.out.println("Annotated method will execute test method : test2");
	}

	@Test
	public void test3() {
		System.out.println("Annotated method will execute test method : test3");
	}

	@AfterMethod

	public void Aftermethod() {
		System.out.println("Annotated method will run after each test method");
	}

	@AfterClass
	public void Afterclass() {
		System.out.println("Annotated method will run only once after all test method in current class have run");
	}

	@AfterTest
	public void Aftertest() {
		System.out
				.println("Annotated method will run after any test method belonging to class inside <test> tag is run");
	}

	@AfterSuite
	public void Aftersuite() {
		System.out.println("Annotated method will run only once before all tests in this suite have run");
	}
}
// 		Sequence of annotations execution
//		@BeforeSuite
//		@BeforeTest
//		@BeforeClass
//		@BeforeMethod
//		@Test
//		@AfterMethod
//		@AfterClass
//		@AfterTest
//		@AfterSuite