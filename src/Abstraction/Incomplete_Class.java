package Abstraction;

public abstract class Incomplete_Class {
    // abstract int i =10; // No allowed 
	
	public static void main(String[] args) {

	// Incomplete_Class IC = new Incomplete_Class();
	}

	public void m1() {
		System.out.println("Hello");
	}

	public abstract void m2();

	public abstract void m3();

	public abstract void m3(int i); // We can overload the abstract method

}