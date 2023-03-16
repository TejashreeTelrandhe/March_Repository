package Arrays;

import java.util.Arrays;

public class Array1 {

	public static void main(String[] args) {

//		int i = 10;
//		int j =20;
		
//		j=40;		
//		System.out.println(j);
		
//      Array declaration 
		
		int arr[]  = new int[10];
		
		//Array initialization 
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		arr[5] = 70;
		arr[6] = 60;
		arr[7] = 90;
		arr [8]= 80;
		arr [9]= 100;
//		arr[10] = 110;
		
		
		System.out.println(arr[0]);
		System.out.println(arr[7]);
		
		//length
		System.out.println(arr.length);
		
        for(int i=0; i<arr.length; i++) {
			
			System.out.print(arr[i]+" ");
		}
        
        System.out.println();
        
		Arrays.sort(arr);		
		
		for(int i=0; i<arr.length; i++) {
			
			System.out.print(arr[i]+" ");
		}
	
		
	}

}