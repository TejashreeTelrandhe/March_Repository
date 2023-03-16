package ExceptionHandling;

public class NumberFormat_Exception {

	public static void main(String[] args) {
		String s = "Number";
		try {
			int num = Integer.parseInt(s);// Parses the string argument as a signed decimal integer.
			System.out.println(num);
		}
		catch (NumberFormatException f) {
			f.printStackTrace();
			System.out.println(f.getMessage());
		} 
		finally {
			System.out.println("Finally block executed after handling NumberFormatException");
		}
	}
}
