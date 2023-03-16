package Loops;

public class While_Loop1 {

	public static void main(String[] args) {
	
//      WAP to print 1 to 5 numbers using while loop
//      Syntax :
//		initialization
//		while(condition) {
//		code
//		inc/dec
//		}
		
		int i=1;    // 1
		
		while(i<=5) {  //1<=5   - True 
			           //2<=5   - True
			           //3<=5   - True
			           //4<=5   - True
			           //5<=5   - True
			           //6<=5   - False
		System.out.println(i);   // 1 2 3 4 5
		i++;       //2 3 4 5 6
		}
		System.out.println("Loop completed");		
	}
}
