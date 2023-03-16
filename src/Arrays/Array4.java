package Arrays;

import java.util.Arrays;

public class Array4 {

	public static void main(String[] args) {

		String s[] = new String[5];

		s[0] = "Rohit";
		s[1] = "Dhoni";
		s[2] = "Virat";
		s[3] = "Rahul";
		s[4] = "RahuA";
//		s[5] = null;

		System.out.println(s[0]);
		System.out.println(s.length);

		Arrays.sort(s);

		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}

	}

}