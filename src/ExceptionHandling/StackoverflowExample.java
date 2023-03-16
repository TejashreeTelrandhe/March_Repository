package ExceptionHandling;

public class StackoverflowExample {

	public static void main(String[] args) {
		System.out.println(add(4));
	}

	public static int add(int a) {
		return add(a) + 5;
	}

}