package Collection;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList3 {

public static void main(String[] args) {
		String arr[] = { "Car", "Car", "Dog", "Elephant" };

		for (String str : arr) {

			System.out.println(str);
		}

		// Converting array into arrayList
		ArrayList AL = new ArrayList(Arrays.asList(arr));

		System.out.println(AL);
	}

}