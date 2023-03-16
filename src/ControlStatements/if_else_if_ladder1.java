package ControlStatements;

public class if_else_if_ladder1 {

	public static void main(String[] args) {
					
		int Marks = 70; 
	
		if(Marks==65) {	 // 40>=65 - false	 70>=65  -true	
			System.out.println("Distinction");
		}
		else if(Marks>=60) { // 40>-60 =False
			System.out.println("1st class");
		}
		else if(Marks>=55) { //40>=55 -false
			System.out.println("Higher second class");
		}
		else if(Marks>=50) { //40>=50 - false
			System.out.println("2nd class");
		}
		else if(Marks>=35) {  //40>=35 -- True
			System.out.println("Pass");
		}
		else
			System.out.println("Fail");		
		}
}
