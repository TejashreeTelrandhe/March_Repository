package Array;

import java.util.Arrays;

public class Boolean_Array {

	public static void main(String[] args) {
		boolean arr[] = { true, false, false, true, true, false };
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",  ");
		}
		System.out.println();
		System.out.println("Boolean at 0th index : " + arr[0]);
		System.out.println("Boolean at 1st index : " + arr[1]);
		System.out.println("Boolean at 2nd index : " + arr[2]);
		System.out.println("Boolean at 3rd index : " + arr[3]);
		System.out.println("Boolean at 4th index : " + arr[4]);
		System.out.println("Boolean at 5th index : " + arr[5]);

	}

}
