package LogicalProgram;

public class StringPalindrome  {
public static void main(String[] args) {
//	String palindrome : A string that reads same from left to right and right to left is palindrome string.

	String s1 = "abcdcba";

	String rev ="";

	for(int i = s1.length()-1;i>=0;i--){
	rev = rev + s1.charAt(i);
	}

	System.out.println(rev);


	if (rev.equals(s1)){
	System.out.println("String is palindrome");
	}

	else{
	System.out.println("String is not palindrome");
	}
}
}
