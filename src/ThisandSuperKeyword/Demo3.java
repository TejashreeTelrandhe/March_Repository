package ThisandSuperKeyword;

public class Demo3 extends Demo2 {

	/*
	 * What is the use of super keyword : Super keyword is used to access global
	 * variable from different/super class
	 */

	int number = 40;

	public static void main(String[] args) {

		Demo3 d3 = new Demo3();
		d3.m1();
	}

	public void m1() {

		int number = 30;

		System.out.println("Local Variable :" + number); // 30
		System.out.println("Global variable call from same class :" + this.number); // 40
		System.out.println("Global varibale call from other class :" + super.number); // 50

	}

}
