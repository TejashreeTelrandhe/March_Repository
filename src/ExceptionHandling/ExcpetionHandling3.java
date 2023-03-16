package ExceptionHandling;

public class ExcpetionHandling3 {

	public static void main(String[] args) {
		System.out.println("hi");
		String Name = null;

		try {
			System.out.println(Name.length());
		} 
		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("line no 15");
		} 
		catch (NullPointerException name) {
			System.out.println(name.getMessage());
			System.out.println("line no 18");
		} 
		catch (NumberFormatException s) {
			System.out.println("line no 21");
		}
		System.out.println("Hello");
	}

}