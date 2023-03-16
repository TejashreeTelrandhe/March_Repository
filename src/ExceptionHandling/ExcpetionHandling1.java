package ExceptionHandling;

public class ExcpetionHandling1 {

	public static void main(String[] args) {

		// Unchecked exception

		System.out.println("Good morning");

//		int i =10;
//      System.out.println(i/0);		 //ArithmeticException

//		String name = null;
//		System.out.println(name.length()); // NullPointerException:x`

		String S = "Abc";
//		int no = Integer.parseInt(S);   //NumberFormatException
//		System.out.println(no);

		int arr[] = new int[5];
		arr[6] = 40; // ArrayIndexOutOfBoundsException

		System.out.println("Hi,good morning");
	}

}