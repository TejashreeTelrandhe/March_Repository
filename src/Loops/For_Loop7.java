package Loops;

public class For_Loop7 {

	public static void main(String[] args) {

// WAP Addition of first 5 numbers
// 1+2+3+4+5 =15
		int sum = 0;
//		 1<=5
//		 2<=5
//		 3<=5
//		 4<=5
//		 5<=5
//		 6<=5  -- false
		for (int i = 1; i <= 5; i++) {

			sum = sum + i;
			System.out.println(sum);
		}
		 System.out.println("Addition of first 5 numbers is :"+sum);

	}

}
