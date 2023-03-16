package String;

public class StringReverse_EachWordReverse {

	public static void main(String[] args) {
		System.out.println("Reverse whole string");
		String s1 = "String Reverse";
		String rev = "";
		for (int i = s1.length() - 1; i >= 0; i--) {
			rev = rev + s1.charAt(i);
		}
		System.out.println(rev);// esreveR gnirtS
		System.out.println();
		System.out.println("Reverse each word in string");
		String s2 = "Concatinates specified string to the end of this string";
		String r = "";
		String s[] = s2.split(" ");
		for (String word : s) {
			System.out.println(word);//Concatinates
					                 //specified
                                     //string
			                         //to
			                         //the
			                         //end
			                         //of
			                         //this
			                         //string
			String reverse = "";
			for (int i = word.length() - 1; i >= 0; i--) {
				reverse = reverse + word.charAt(i);
			}
			r = r + reverse + " ";
		}
		System.out.println(r);//setanitacnoC deificeps gnirts ot eht dne fo siht gnirts 
	}

}
