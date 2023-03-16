package Polymorphism;

public class Demo1 {

	public static void main(String[] args) {

		Demo1.m1();
		Demo1 D1 = new Demo1();
		D1.m2();

	}

	public static void m1() { // Method Declaration

		System.out.println("Static method"); // Method Definition
	}

	public void m2() { // Method Declaration

		System.out.println("Non static method"); // Method Definition
	}

}
