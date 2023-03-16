package ControlStatements;

public class Nested_if_Statement1 {

	public static void main(String[] args) {
	
    int a= 100;
    int b= 200;
    int c= 300;
    
    if(a>b) {   //100>200  - false
    	if(a>c) {
    		System.out.println("A is the greatest number");
    	}
    }
    else if(b>c) {   // 200>300  - false
    	System.out.println("B is the greatest number");
    }
    else {
    	System.out.println("C is the greatest number");
    	
    }
    	
 	}

}
