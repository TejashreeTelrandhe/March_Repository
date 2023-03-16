package ExceptionHandling;

public class Arithmetic_Exception {

	public static void main(String[] args) {
		int i = 100;
		try {
			System.out.println(i / 0);// ArithmeticException
		} 
		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} 
		finally {
			System.out.println("Finally block executed");
		}
	}

}
