package Keywords;

public class FinallyKeyword {

	public static void main(String[] args) {
		int i = 10;
		try {
			i = i / 0;
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
		} 
		finally {
			System.out.println("Finally block executed");
		}
	}

}
