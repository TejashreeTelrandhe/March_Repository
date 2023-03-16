package Array;

import java.util.Arrays;

public class String_Array {

	public static void main(String[] args) {
		String array[] = { "File", "Edit", "Source", "Refactor", "Navigate", "Search" };
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ",  ");
		}
		System.out.println();
		System.out.println("String at 0th index : " + array[0]);
		System.out.println("String at 1st index : " + array[1]);
		System.out.println("String at 2nd index : " + array[2]);
		System.out.println("String at 3rd index : " + array[3]);
		System.out.println("String at 4th index : " + array[4]);
		System.out.println("String at 5th index : " + array[5]);

		System.out.println();

		System.out.println("Sorted array");
		Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
