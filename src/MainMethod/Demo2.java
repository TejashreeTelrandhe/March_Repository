package MainMethod;

public class Demo2 {

	public final synchronized strictfp static void main(String[] name) {

		System.out.println("Good morning");

		/*
		 * 1. The order of access modifiers is not important that is instead of
		 * "Public static" we can take "static public"
		 * 
		 * 2. We can declare string[] in any acceptable form String[] args String args[]
		 * String []args
		 * 
		 * 3. args - name of array instead of 'args' we can take any valid java
		 * identifier
		 * 
		 * 
		 * 4 .String[] args - String... args We cam replace String[] args with var args
		 * parameters
		 * 
		 * 
		 * Q- Can we delare main method with final.synchrionized keyword -- Yes 5.public
		 * final synchronized strictfp static void main(String [] name) { Strict
		 * floating point
		 */

	}

}