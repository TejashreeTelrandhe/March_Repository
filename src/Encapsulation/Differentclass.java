package Encapsulation;

public class Differentclass {

	public static void main(String[] args) {

		Empdata emp = new Empdata();

		emp.setAge(33);
		emp.setName("Ketan");
		emp.setRollNo(22);
		emp.setSal(40000);

		System.out.println(emp.getName());
		System.out.println(emp.getAge());
		System.out.println(emp.getRollNo());
		System.out.println(emp.getSal());
	}

}