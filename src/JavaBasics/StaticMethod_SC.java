package JavaBasics;

public class StaticMethod_SC {

	public static void main(String[] args) {
		method1();
		method2();
		System.out.println();
		StaticMethod_SC.method1();
		StaticMethod_SC.method2();
	}

	public static void method1() {
		int num1 = 25;
		int num2 = 35;
		System.out.println("Multiplication = " + (num1 * num2));
	}

	public static void method2() {
		int m1 = 225;
		int m2 = 35;
		System.out.println("Division = " + (m1 / m2));
	}

}
