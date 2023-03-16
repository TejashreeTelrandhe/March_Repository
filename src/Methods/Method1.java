package Methods;

public class Method1 { // Class body

	public static void main(String[] args) { // Main method body
		// Starting point of program

		// Static regular method call from same class

		System.out.println("Main Mehtod started");

		// 1. Direct Calling by method name
		// Syntax - Methodname();

		staticregularmethodm1();
		staticregularmethodm2();

		// 2 . Calling by class name
		// syntax - Classname.methodname();

		Method1.staticregularmethodm1();
		Method1.staticregularmethodm2();

		System.out.println("Main method ended");

	}

	public static void staticregularmethodm1() {

		System.out.println("Static method is running from the same clas :m1");
	}

	public static void staticregularmethodm2() {

		System.out.println("Static method is running from the same clas :m2 ");
	}

}
