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

public class Annotations_2 {
	@BeforeSuite
	public void Beforesuite() {
		System.out.println("@BeforeSuite -- Set Property for chrome");
	}

	@BeforeClass
	public void Beforeclass() {
		System.out.println("@BeforeClass -- Launch chrome");

	}

	@BeforeTest
	public void Beforetest() {
		System.out.println("@BeforeTest -- Enter URL");
	}

	@BeforeMethod
	public void Beforemethod() {
		System.out.println("@BeforeMethod -- Login to application");
	}

	@Test
	public void test1() {
		System.out.println("@Test -- Google Test");
	}

	@Test
	public void test2() {
		System.out.println("@Test -- Firefox Test");
	}

	@Test
	public void test3() {
		System.out.println("@Test -- Edge Test");

	}

	@AfterMethod
	public void Aftermethod() {
		System.out.println("@AfterMethod -- Logout from application");
	}

	@AfterTest
	public void Aftertest() {
		System.out.println("@AfterTest -- Delete all cookies");
	}

	@AfterClass
	public void Afterclass() {
		System.out.println("@AfterClass -- Close chrome");

	}

	@AfterSuite
	public void Aftersuite() {
		System.out.println("@AfterSuite -- Quitting ");
	}
}
