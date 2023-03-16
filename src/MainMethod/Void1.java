package MainMethod;

public class Void1 {

	public static void main(String[] args) {
		// Void1.addition(10, 20);

		Void1.m2(20, 30);

		int sum = addition(20, 40);

		System.out.println(sum);

		// add= m2(30,40);

		// System.out.println(add);

	}

	public static int addition(int a, int b) {

		int sum = a + b;

		// System.out.println(sum);

		return sum;
	}

	public static void m2(int i, int j) {

		System.out.println(addition(10, 30));
	}
	/*if u want a method to return value,you can declared a primitive data type
	 * such int char etc. instead of void and return keyword inside the method
	 */
}