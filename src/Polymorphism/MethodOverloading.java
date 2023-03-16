package Polymorphism;

public class MethodOverloading {

	public static void main(String[] args) {
		
		
//When the method name is same with different argument/input parameters with different data types 
//within the same class is called as method overloading.

		
//  We can not create a method inside a method 
//	Same method name with same number of argument are not allowed 
		
		MethodOverloading  MO  = new MethodOverloading();
		MO.m1();
		MO.m1(44.3);
		MO.m1(33);
		MO.m1("Rahul");
		
	}
	
	public void m1() {		
		System.out.println("No/Zero argument method");
	}	
	
	public void m1(int i) {
		System.out.println("int argument method");
	}
	
	public void m1(String i) {
		System.out.println("String argument method");
	}
	
	public void m1(double d) {
		System.out.println("double argument method");
	}

}