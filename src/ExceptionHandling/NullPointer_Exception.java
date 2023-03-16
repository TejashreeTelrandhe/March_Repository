package ExceptionHandling;

public class NullPointer_Exception {

	public static void main(String[] args) {
		String name = null;
		try {
		System.out.println(name.length());//NullPointerException
		}
		catch(NullPointerException n) {
			n.printStackTrace();
			System.out.println(n.getMessage());
		}
		finally {
			System.out.println("finally block executed after handling NullPointerException");
		}
	}
}
