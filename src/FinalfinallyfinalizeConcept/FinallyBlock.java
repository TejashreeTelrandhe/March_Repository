package FinalfinallyfinalizeConcept;

public class FinallyBlock {

	public static void main(String[] args) {

		/*Finally - Finally is a block in java exception handling to execute the
		 * important code weather the exception occurs or not
		 */
		FinallyBlock.Test();
		FinallyBlock.div();
	}

	public static void Test() {

		try {
			System.out.println("Test method");
		} catch (Exception e) {
			System.out.println("Catch block");
		} finally {
			System.out.println("Finally block");
		}

	}

	public static void div() {
		int i = 10;

		try {
			System.out.println("Div test method");
			int k = i / 0;
		} catch (NullPointerException e) {
			System.out.println("inside catch block");
			System.out.println("Divided by zero erro");
		} finally {
			System.out.println("Executed this code even after any exception");
		}
	}
}