package Demo;

public class Void2 {

	public static void main(String[] args) {

		System.out.println(Void2.sub(2));
		Void2.m4();
	}

	public static int sub(int a) {
		return 5 - a;
	}

	public static void m4() {
		System.out.println(sub(4));
	}

}