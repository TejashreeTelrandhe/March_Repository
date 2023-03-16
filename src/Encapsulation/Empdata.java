package Encapsulation;

public class Empdata {

	private String Name;
	private int Age;
	private int RollNo;
	private int Sal;

	public static void main(String[] args) {

		Empdata Emp = new Empdata();

		Emp.setName("Rahul");
		Emp.setAge(25);
		Emp.setRollNo(22);
		Emp.setSal(100000);

		System.out.println("Emp name :" + Emp.getName());
		System.out.println("Emp Age :" + Emp.getAge());
		System.out.println("Emp RollNo :" + Emp.getRollNo());
		System.out.println("Emp Sal :" + Emp.getSal());
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public int getRollNo() {
		return RollNo;
	}

	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}

	public int getSal() {
		return Sal;
	}

	public void setSal(int sal) {
		Sal = sal;
	}

}