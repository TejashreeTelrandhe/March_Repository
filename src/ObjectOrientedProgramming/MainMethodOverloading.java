package ObjectOrientedProgramming;

public class MainMethodOverloading {
//  We can  overload the main method with different parameter lists,
//	, and these overloaded methods can be called like any other method.
	public static void main(String[] args) {
		System.out.println("String array parameter");
		main(true);
		main(9);
	}

	public static void main(boolean b) {
		System.out.println("Boolean array parameter");
		b = false;
		System.out.println(b);
	}

	public static void main(int i) {
		System.out.println("Int array parameter");
		i = 10;
		System.out.println(i);
	}
}
