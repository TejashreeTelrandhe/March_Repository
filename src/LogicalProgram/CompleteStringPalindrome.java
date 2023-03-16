package LogicalProgram;

public class CompleteStringPalindrome {
public static void main(String[] args) {
//	Reverse the complete string 

	String s = "String Palindrome";

	String rev = "";

	for(int i = s.length()-1; i>=0 ;i--){
	rev = rev +s.charAt(i);
	}
	System.out.println(rev);
}
}
