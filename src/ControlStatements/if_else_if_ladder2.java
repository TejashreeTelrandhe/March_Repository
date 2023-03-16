package ControlStatements;

public class if_else_if_ladder2 {

	public static void main(String[] args) {

		/* 1- Sunday
		 * 2- Monday
		 * 3
		 * 4
		 * 5
		 * 6
		 * 7 - Saturday
		 */		
		int day =8;
		
		if(day==1) {  // 4==1 false
			System.out.println("Sunday");
		}
		else if(day==2) {  //4==2  false
			System.out.println("Monday");
		}
		else if(day==3) { //4==3 -- false
			System.out.println("Tuesday");
		}
		else if(day==4) {  //4==4 true
			System.out.println("Wednesday");
		}	
		else if(day==5) {
			System.out.println("Thursday");
		}
		else if (day==6) {
			System.out.println("Friday");
		}
		else if (day ==7) {
			System.out.println("saturday");
		}
		else {
			System.out.println("Not matched");
		}
				
	}

}
