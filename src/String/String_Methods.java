package String;

import java.util.regex.Pattern;

public class String_Methods {

	public static void main(String[] args) {
		String s1 = "Methods";
		System.out.println("lenghth() method = " + s1.length());// 7
		System.out.println();
		
		System.out.println("isEmpty() method = " + s1.isEmpty());// false
		System.out.println();
		
		System.out.println("charAt() method = " + s1.charAt(0));// M
		System.out.println();
		
		String s2 = "methods";
		System.out.println("equalsIgnoreCase() method = " + s1.equalsIgnoreCase(s2));// true
		System.out.println();
		
		System.out.println("equals() method = " + s1.equals(s2));// false
		System.out.println();
		
		System.out.println("concat() method = " + s1.concat(s2));// Methodsmethods
		System.out.println();
		
		System.out.println("substring() method = " + s2.substring(1, 4));// eth
		System.out.println();
		
		String s3 = "Backspace";
		System.out.println("replace() method = " + s3.replace('a', 'e'));// Beckspece
		System.out.println();
		
		System.out.println("indexOf() method = " + s3.indexOf('a'));// First occurence = 1
		System.out.println();
		
		System.out.println("lastIndexOf() method = " + s3.lastIndexOf('a'));// Last occurence = 6
		System.out.println();
		
		System.out.println("toLowerCase() method = " + s3.toLowerCase());// backspace
		System.out.println();
		
		System.out.println("toUpperCase() method = " + s2.toUpperCase());// METHODS
		System.out.println();
		
		String s4 = " Control ";
		System.out.println("trim() method = " + s4.trim());// Control
		System.out.println();
		
		System.out.println("replaceAll() method = " + s4.replaceAll("o", "a"));// Cantral
		System.out.println();
		String s5 = "String to lowercase";
		String s[] = s5.split(" ");
		System.out.println("split() method = ");
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);// String
										// to
										// lowercase
		}
		System.out.println();
		
		System.out.println("regex pattern = " + Pattern.matches("[a-zA-Z0-9]{6}", "AHell4"));
		System.out.println("regex pattern = "+Pattern.matches("[a-z0-9@#]{4}", "te9@"));
		System.out.println();
		
		StringBuffer SB = new StringBuffer("pattern");
		System.out.println("StringBuffer reverse() method = "+SB.reverse());//nerttap
	}

}
