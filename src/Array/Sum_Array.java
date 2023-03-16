package Array;

import java.util.Arrays;

public class Sum_Array {

	public static void main(String[] args) {
		System.out.println("Sum of elements in the array");
		int array[] = { 78, 25, 96, 65, 96, 15, 63, 45 };
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		System.out.println(sum);

		System.out.println();

		System.out.println("Sorted array");
		Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
