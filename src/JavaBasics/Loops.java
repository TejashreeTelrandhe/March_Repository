package JavaBasics;

public class Loops {
//	Loops are used to repeat block of code.

	public static void main(String[] args) {
// 1. for loop
//		for(intialization,condition,inc/dec) {
//			code to be executed
//		}
//		WAP to print odd numbers from 99 to 11 
		for (int i = 9; i >= 1; i = i - 2) {
			System.out.println(i);
		}
		System.out.println();
// 2. while loop
//	intialization
//	while(condition){
//	code to be executed
//	inc/dec
//}
//	WAP to print number from 15 to 150 multiples of 15 
		int j = 15;
		while (j <= 150) {
			System.out.println(j);
			j = j + 15;
		}
		System.out.println();
//	do while loop 
//	intialization
//	do{
//	code to be execute;
//	inc/dec;
//  }
//	while(condition);
//	WAP to print number from 0 to 50 
		int c = 0;
		do {
			System.out.println(c);
			c = c + 5;
		} while (c <= 50);
		System.out.println();
//	for each loop
//	for(datatype variable: arrayor collection){
//	code to be executed
//  }
		String arr[] = { "Arr1", "Arr2", "Arr3", "Arr4" };
		for (String array : arr) {
			System.out.println(array);
		}

	}
}