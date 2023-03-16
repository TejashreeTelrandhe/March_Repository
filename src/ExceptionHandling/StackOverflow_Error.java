package ExceptionHandling;

public class StackOverflow_Error {

	public static void main(String[] args) {
		System.out.println("A stack overflow is an undesirable condition in which a particular "
				+ "computer program tries to use more memory space than the call stack has available."
				+ " In programming, the call stack is a buffer that stores requests that need to be handled.");
		System.out.println();
		System.out.println(add(4));
	}

	public static int add(int a) {

		return add(a) + 5;

	}
}
