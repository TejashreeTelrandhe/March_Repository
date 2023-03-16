package ExceptionHandling;

public class ArrayIndexOutOfBoundException {

	public static void main(String[] args) {
		int arr[] = new int[3];
		arr[0] = 45;
		arr[1] = 55;
		arr[2] = 65;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		try {
			System.out.println(arr[3]);// ArrayIndexOutOfBoundsException
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		} finally {
			System.out.println("FInally block executed after handling ArrayIndexOutOfBoundsException");
		}
	}

}
