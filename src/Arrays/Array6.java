package Arrays;

public class Array6 {

	public static void main(String[] args) {
		Object obj[] = new Object[6];

		obj[0] = 10; // int
		obj[1] = 20.5; // double
		obj[2] = "Java"; // String
		obj[3] = 'V'; // char
		obj[4] = true; // boolean
		obj[5] = null; // null

		System.out.println(obj.length);

		for (int i = 0; i < 6; i++) {
			System.out.println(obj[i]);
		}

	}

}
