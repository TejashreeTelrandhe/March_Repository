package Loops;

public class For_Loop3 {

	public static void main(String[] args) {

//        Print even number 2 to 10;

//        2<=10   - True
//		  4<=10   - True
//		  6<=10    - True 
//		  8<=10    - True
//		  10<=10   -True
//		  12<=10   - false
		for (int i = 2; i <= 10; i = i + 2) {

			System.out.println(i); // 2 ,4 ,6 ,8 ,10
		}
		System.out.println("Loop competed");

	}

}
