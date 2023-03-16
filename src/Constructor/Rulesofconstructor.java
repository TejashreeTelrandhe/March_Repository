package Constructor;

public class Rulesofconstructor {
	// 1. Name of the constructor is must be same as class name
	public Rulesofconstructor() {

		System.out.println("Default constructor");
	}

	// 2. We can not create constructor inside the method/functions.

	// 3.Return type concept is not applicable for constructor even void aslo
	// if u take void keyword that time compiler will treated as method

	// 4.Applicable modifiers/Keywords - public , private , protected, default
	// Not applicable modifiers/keywords - final, static, abstract, native

	// 5. Any number of constructor can be declared in java but constructor name
	// should be same as
	// class name but argument/parameters should be different.

	// Can we overload constructor - Yes

	public Rulesofconstructor(int i) {
		System.out.println("int default cons");

	}

	public Rulesofconstructor(char i) {
		System.out.println("int default cons");

	}

	public Rulesofconstructor(int i, int j) {

		System.out.println("default con");
	}

	public Rulesofconstructor(String s, int j) {

		System.out.println(s + " " + j);

	}

	public static void main(String[] args) {

		Rulesofconstructor R = new Rulesofconstructor();

		Rulesofconstructor R1 = new Rulesofconstructor(10);
		Rulesofconstructor R3 = new Rulesofconstructor("Rahul", 30);

	}

}
