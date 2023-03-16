package Arrays;

import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {
		char c[] = new char[5]; // java.lang.NegativeArraySizeException:

		c[0] = 'A';
		c[1] = 'C';
		c[2] = '@';
		c[3] = 'B';
		c[4] = '#';
		// c[5] = 'S'; //java.lang.ArrayIndexOutOfBoundsException

		System.out.println(c.length);
		Arrays.sort(c);

		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
//		System.out.println();
	}

}
