package JavaBasics;

public class NonStaticGlobalVariable_DC {
	String role ="Manual tester";
	double experience = 2.7;
	int salary = 52000;
	public static void main(String[] args) {
				
		NonStaticGlobalVariable_SC NSGV = new NonStaticGlobalVariable_SC();
		System.out.println("Student age = "+NSGV.age);
		System.out.println("Student percent = "+NSGV.percent);
		System.out.println("Student name = "+NSGV.name);
		System.out.println("Student grade = "+NSGV.grade);
		System.out.println("Student college = "+NSGV.college);
		System.out.println();
		
		NonStaticGlobalVariable_DC NSGVDC = new NonStaticGlobalVariable_DC();
		System.out.println("Student role = "+NSGVDC.role);
		System.out.println("Student experience = "+NSGVDC.experience);
		System.out.println("Student salary = "+NSGVDC.salary);
	}

}
