package Arrays;

import java.util.Arrays;

public class Array7 {

	public static void main(String[] args) {

		// Declaration & initialization

		int arr[] = new int[5];// dec
		arr[0] = 4;

		int arr1[] = { 10, 20, 30, 60, 50, 40 }; // Declaration & initialization

		System.out.println(arr1.length);

		System.out.println(arr1[3]);

		Arrays.sort(arr1);

		for (int i = 0; i < 6; i++) {
			System.out.println(arr1[i]);
		}
	}

}
