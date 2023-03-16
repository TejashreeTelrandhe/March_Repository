package Loops;

public class do_while_loop {

	public static void main(String[] args) {
		
		// WAP To print 1 to 5 numbers
		
		//syntax
		
		/* initialization
		 * do{ 
		 * code to be executed
		 * inc/dec
		 * }
		 * while(condition)
		 */

		
		int i=1;  
		
		do {			
			System.out.println(i);   //1 2
			i++;                     //2 3
		}
		while(i<=5);  
	}

}
