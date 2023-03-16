package Polymorphism;

public class Test {

	public static void main(String[] args) {
		Parent P1 = new Parent();

		P1.Car();
		P1.Home();
		P1.money(10);

		System.out.println();

		Child C1 = new Child();

		C1.Car(); //
		C1.Home();
		C1.money(10);
		C1.m1();

		Parent P2 = new Child(); // Top Casting / Dynamic Poly.
		P2.Car();
		P2.Home();
		P2.money(11);
		// P2.m1();

		Child C2 = (Child) new Parent(); // Down Casting
	}

}