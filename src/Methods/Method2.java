package Methods;

public class Method2 {

	public static void main(String[] args) {

	// 1. Static regular method calling from same class

		System.out.println("Main method started");
	// 1. Direct calling

		m1();
		m2();

	// 2. Calling by class name
		Method2.m1();
		Method2.m2();

		System.out.println("Main method ended");

	}

	public static void m1() {

		System.out.println("M1");
	}

	public static void m2() {
		System.out.println("M2");
	}
}
