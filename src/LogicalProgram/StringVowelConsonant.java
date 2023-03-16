package LogicalProgram;

public class StringVowelConsonant {
public static void main(String[] args) {
//	String vowel and consonant

	String s1 = "Swapping two numbers without third variable";

	s1=s1.toLowerCase();

	int vowel =0;

	int consonant =0;

	for(int i = 0;i<s1.length();i++){

	if(s1.charAt(i)=='a' || s1.charAt(i)=='e' || s1.charAt(i)=='i' || s1.charAt(i)=='o'|| s1.charAt(i)=='u'){

	vowel++;
	}
	else {

	consonant++;
	}}

	System.out.println("Vowel = "+vowel);

	System.out.println("Consonant = "+consonant);
}
}
