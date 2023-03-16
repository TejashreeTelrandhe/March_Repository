package Abstraction;

public class Test {

	public static void main(String[] args) {

		SubClass SC = new SubClass();  // Static Binding
		
		SC.m1();   //
		SC.m2();
		SC.m3();
		System.out.println();
		
		Incomplete_Class IC = new SubClass();  // Dynamic
		 
		IC.m1();
		IC.m2();
		IC.m2();
		
		System.out.println();
		
		HDFCBank HB =new HDFCBank();
		
		HB.credit();  // RBI
		HB.debit();  //RBI
		HB.loan();    //HDFC -loan
		HB.Mutual();  // HDFC - mutual
				
		System.out.println();
		
		RBIBank RB =new HDFCBank();
		
		RB.credit();   // RBI
		RB.debit();   //  RBI / HDFC
		RB.loan();     // HDFC
		
	}

}