package JavaBasics;

public class NonStaticGlobalVariable_SC {
// NonStaticGlobalVariable are the variable declared outside method body.
//		These variables are declared without using static keyword.
//		Can be called by object creation of class using refvariable.variablename.
	int age = 23;
	double percent = 85.4;
	String name = "Tejashree Telrandhe";
	char grade = 'A';
	String college = "Institute of Science, Nagpur";

	public static void main(String[] args) {
		NonStaticGlobalVariable_SC NSGV = new NonStaticGlobalVariable_SC();
		System.out.println("Student age = "+NSGV.age);
		System.out.println("Student percent = "+NSGV.percent);
		System.out.println("Student name = "+NSGV.name);
		System.out.println("Student grade = "+NSGV.grade);
		System.out.println("Student college = "+NSGV.college);
	}

}
