package Constructor;

public class Needofconstructor1 {
	String name;
	int RollNo;

	public Needofconstructor1() {

	}
//Purpose of constructor 

//1.once we create an object compulsory we required to perform initialization for that object. 
// The constructor is specially designed to perform initialization of object.
// Every time an object is created using new keyword at least one constructor is called

	public static void main(String[] args) {

		Needofconstructor1 student1 = new Needofconstructor1();
		Needofconstructor1 student2 = new Needofconstructor1();
		Needofconstructor1 student3 = new Needofconstructor1();
		student3.m1();
		student3.m2();
	}

	public void m1() {

		System.out.println(name + " " + RollNo);
	}

	public void m2() {

		System.out.println(name + " " + RollNo);
	}

}
