package Methods;

public class Method4 {

	public static void main(String[] args) {

		// different class/another class

		System.out.println("Main Method started");

		// 1. Direct calling

		// demo1(); // Direct calling by method is not allowed
		// demo2();
		demo3();

		// 2. Calling by class name
		// syatax - Classname.methodname();
		Method3.demo1();
		Method3.demo2();
		Method4.demo3();

		System.out.println("Main Method ended");
	}

	public static void demo3() {
		System.out.println("Good morning");
	}

}
