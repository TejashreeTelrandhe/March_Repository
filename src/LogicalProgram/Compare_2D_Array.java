package LogicalProgram;

import java.util.Arrays;

public class Compare_2D_Array {

	public static void main(String[] args) {
//		Compare Two dimensional array

		int arr1 [][] = {{1,2,3,4,5},{5,8,5,6,7}};

		int arr2 [][] = {{5,8,5,6,7},{11,12,13,14,15}};

		int arr3 [][] = {{11,12,13,14,15},{5,8,5,6,7}};

		System.out.println(Arrays.deepEquals(arr1,arr2));

		System.out.println(Arrays.deepEquals(arr1,arr3));

		System.out.println(Arrays.deepEquals(arr2,arr3));
	}

}
