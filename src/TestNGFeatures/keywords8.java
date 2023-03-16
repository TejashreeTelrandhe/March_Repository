package TestNGFeatures;

import org.testng.annotations.Test;

public class keywords8 {

//Q - if u want to handle exception without try catch block so how will u handle it
	// ans - By using expectedexception = Exceptiontype.class
	@Test(expectedExceptions = ArithmeticException.class)

	public void Test1() {
		System.out.println("Handle arithmeticexception");
		int i = 10 / 0;
	}
}