package Operator;
public class IncDecOperator {

	public static void main(String[] args) {
	
		int a =10;
		int b= 20;
		
		int  c ;
		a++;
		c  = a;   // Assignment operator
		System.out.println(c);//11
		
		
		c=b;
		System.out.println(c);//20
		
		c++;  // increment by one
		System.out.println(c);//21
		
		c=c+1;  // increment by one
		System.out.println(c);//22
		
		c--;  // decrement by one
		System.out.println(c);//21
		
		c = c-1; // decrement by one
		System.out.println(c);//20
		
	}

}
