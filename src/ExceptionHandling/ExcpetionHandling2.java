package ExceptionHandling;

public class ExcpetionHandling2 {

	public static void main(String[] args) {

		System.out.println("Hi");

		int a = 20;
		try {
			System.out.println(a / 0); // This code will throw an exception
		} catch (ArithmeticException e) {// Here we have to tell what type of exception will throw
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("Hello");
	}
	// if u don't know the exception name - generic exception (Exception e)

}