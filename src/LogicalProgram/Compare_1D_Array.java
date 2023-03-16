package LogicalProgram;

import java.util.Arrays;

public class Compare_1D_Array{

	public static void main(String[] args) {
//		Compare One dimensional array

		int arr1 [] = {1,2,3,4,5};

		int arr2 [] = {5,8,5,6,7};

		int arr3 [] = {11,12,13,14,15};


		System.out.println(Arrays.equals(arr1,arr2));
		System.out.println(Arrays.equals(arr2,arr3));
		System.out.println(Arrays.equals(arr3,arr1));
	}

}
