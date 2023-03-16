package Keywords;

public class FinalKeywords {

	public static void main(String[] args) {
		final int a = 52;
		System.out.println(a);
//      a =10;

		FinalKeywords FK = new FinalKeywords();
		FK.finalmethod();
	}

	public final void finalmethod() {
		System.out.println("Final Method");
	}
}
