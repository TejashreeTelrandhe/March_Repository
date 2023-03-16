package Constructor;

public class DefaultConstructor {
	/*
	 * Default constructor public DefaultConstructor(){ Super();
	 * 
	 * } Use - it copies the members of classed into object - after creation of
	 * object Rules : 1.It is always no argument/zero argument/parameter constructor
	 * 2. Access modifiers of the default constructor is same as class modifiers 3.
	 * Default constructor contains only one line that is super() keyword.
	 *
	 */

	public static void main(String[] args) {

		DefaultConstructor DC = new DefaultConstructor();
		DC.m1();
	}

	public void m1() {

		System.out.println("Zero input parameter method");
	}

	public void add() {

		int i = 10;
		int j = 30;
		int sum = i + j;

	}

}
