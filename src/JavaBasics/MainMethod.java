package JavaBasics;

public class MainMethod {

	public static void main(String[] args) {
//  public : Access specifier defines public access so that it is visible 
//		to every other class, even which are not part of package

//	static : main method is static so compiler can call it without creation of
//		an object or before creation of object of class

//	void : main method doesnot return anything therefore its return type is void

//  main(): it is the name of method .This method name is searched by JVM as starting point of application

// String[] args : means the array sequence of character(String) that are passed to main method.

		System.out.println("Order of access specifier is not important we can use static public also");
		System.out.println();
		System.out.println("We can declare String [] args , String[] args, String []args, String args[]");
		System.out.println();
		System.out.println("args: is the name of the array we can use any valid java id");
		System.out.println();

		System.out.println("public static void main(String[] name), public static void main(String[] obj)");
		System.out.println();
		System.out.println("String[] args is equivalent to String ... args");
		System.out.println();
		System.out.println("public final synchronized strictfp static void main(String[] args) is also valid ");
		System.out.println("strictfp - strict floating pool");
		System.out.println();
		System.out.println("public final static void main(String[] args) ");
	}
//	 static public void main(String[] args) {
//
//	}
}
