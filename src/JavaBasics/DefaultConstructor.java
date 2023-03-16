package JavaBasics;

public class DefaultConstructor {
	int i1 = 11;
	int i2 = 22;
	int i3 = 33;

	public static void main(String[] args) {
		DefaultConstructor dd = new DefaultConstructor();
		System.out.println("i1 = " + dd.i1);
		System.out.println("i2 = " + dd.i2);
		System.out.println("i3 = " + dd.i3);
		dd.method1();
		dd.method2();
		dd.method3();
	}

	public void method1() {
		String s1 = "Non-Static method1";
		System.out.println("String s1 = " + s1);
	}

	public void method2() {
		String s2 = "Non-Static method2";
		System.out.println("String s2 = " + s2);
	}

	public void method3() {
		String s3 = "Non-Static method3";
		System.out.println("String s3 = " + s3);
	}
}
