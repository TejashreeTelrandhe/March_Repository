package ExceptionHandling;

public class Trycatchfinally {

	public static void main(String[] args) throws InterruptedException {

		int arr[] = new int[5];

		Thread.sleep(3000);
		try {
			arr[10] = 100; // ArrayIndexOutOfBoundsException
		}

		catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("Hello");
		}

		finally {

			System.out.println("This is finally block");
		}

		// Exception occur, catchblock block handle, finally block aslo executed
		// Exception occur, catchblock not handle, finally block aslo executed
		// Exception not occur, catchblock ignore, finally block aslo executed

	}

}