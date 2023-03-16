package Array;

import java.util.Arrays;

public class Reverse_Array {

	public static void main(String[] args) {
		System.out.println("Elements in reverse order");
		int arr[] = { 12, 23, 34, 45, 67, 78, 89 };
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
		System.out.println();
		System.out.println("Elements in sorted manner");
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
