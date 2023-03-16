package Array;

import java.util.Arrays;

public class Int_Array {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 4, 5, 7, 8 };
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println();
		System.out.println("Array at 0th index : " + arr[0]);
		System.out.println("Array at 1st index : " + arr[1]);
		System.out.println("Array at 2nd index : " + arr[2]);
		System.out.println("Array at 3rd index : " + arr[3]);
		System.out.println("Array at 4th index : " + arr[4]);
		System.out.println("Array at 5th index : " + arr[5]);

		System.out.println();

		System.out.println("Sorted array");
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
