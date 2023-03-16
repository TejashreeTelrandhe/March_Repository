package LogicalProgram;

public class JunkWords {

	public static void main(String[] args) {
		// Junk words

		String s1 = "!Sw@a#p$i$n&g&Nu*mb??er";

		s1 = s1.replaceAll("[^a-z,A-Z]", "");

		System.out.println(s1);
	}

}
