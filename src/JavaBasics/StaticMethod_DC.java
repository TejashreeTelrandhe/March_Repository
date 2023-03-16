package JavaBasics;

public class StaticMethod_DC {

	public static void main(String[] args) {
		method3();
		method4();
		System.out.println();
		StaticMethod_SC.method1();
		StaticMethod_SC.method2();
		System.out.println();
		StaticMethod_DC.method3();
		StaticMethod_DC.method4();
	}
	public static void method3() {
		int num1 = 25;
		int num2 = 35;
		System.out.println("Addition = " + (num1 + num2));
	}

	public static void method4() {
		int m1 = 225;
		int m2 = 35;
		System.out.println("Substraction = " + (m1 - m2));
	}

}
