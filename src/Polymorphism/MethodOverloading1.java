package Polymorphism;

public class MethodOverloading1 {

	public static void main(String[] args) {

		MethodOverloading1.m1(30);
		MethodOverloading1.m1();

		MethodOverloading1 M1 = new MethodOverloading1();

		M1.addition(30, 3);
		M1.addition(10, 200, 30);

	}

	public void addition(int i, int j) { // Two i/p para

		int sum = i + j; // 30+3
		System.out.println(sum);
	}

	public void addition(int i, int j, int k) {

		int sum = i + j - k; // 10+200-30 == 180
		System.out.println(sum);
	}

	public static void m1() {
		System.out.println("Zero i/p param method");

	}

	public static void m1(int i) {
		System.out.println("One i/p prar method");
	}

}