package Array;

import java.util.Arrays;

public class Char_Array {

	public static void main(String[] args) {
		char array[] = { 'S', 'A', 'G', 'A', 'R' };
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+",  ");
		}
		System.out.println();
		System.out.println("Character at 0th index : " + array[0]);
		System.out.println("Character at 1st index : " + array[1]);
		System.out.println("Character at 2nd index : " + array[2]);
		System.out.println("Character at 3rd index : " + array[3]);
		System.out.println("Character at 4th index : " + array[4]);
		System.out.println();
		
		System.out.println("Sorted array");
		Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
