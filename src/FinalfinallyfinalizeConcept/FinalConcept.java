package FinalfinallyfinalizeConcept;

public  class FinalConcept {

	public static void main(String[] args) {
		/*final - Final is the keyword and access modifier which is used to restriction  on
		variables,class and methods */
				
		int i =100;
		System.out.println(i);
		
		i=300;
		System.out.println(i);
		
		final int j =200;
		System.out.println(j);
		//j=400;
	}
	
	public final void finalmethod()
	{
		System.out.println("Final Method");
	}
}