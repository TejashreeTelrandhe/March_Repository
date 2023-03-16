package Polymorphism;

public class StaticChild extends Staticparent {

	public static void m1() {

		System.out.println("Static child class");
	}

	@Override
	public void m2() {

		System.out.println("Non static child method :m2"); // Method definition
	}

	public static void main(String[] args) {

		Staticparent S1 = new Staticparent();
		S1.m1();
		S1.m2();

		System.out.println();

		StaticChild S2 = new StaticChild();
		S2.m1();
		S2.m2();

		System.out.println();

		Staticparent S3 = new StaticChild(); // Method hiding
		S3.m1();
		S3.m2();
	}

}