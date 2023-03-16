package ObjectOrientedProgramming;

public class Encapsulation_DC {
	String keyword;
	String assertion;
	int section;
	float rate;

	public static void main(String[] args) {
		Encapsulation_SC E2 = new Encapsulation_SC();
		E2.setGrade('A');
		E2.setName("Telrandhe");
		E2.setProject("Healthcare");
		E2.setRollno(250);
		System.out.println(E2.getGrade());
		System.out.println(E2.getName());
		System.out.println(E2.getRollno());
		System.out.println(E2.getProject());

		System.out.println();
		Encapsulation_DC E3 = new Encapsulation_DC();
		E3.setAssertion("assertNotEqual");
		E3.setKeyword("priority");
		E3.setRate(15.5f);
		E3.setSection(5);
		System.out.println(E3.getAssertion());
		System.out.println(E3.getRate());
		System.out.println(E3.getSection());
		System.out.println(E3.getKeyword());
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getAssertion() {
		return assertion;
	}

	public void setAssertion(String assertion) {
		this.assertion = assertion;
	}

	public int getSection() {
		return section;
	}

	public void setSection(int section) {
		this.section = section;
	}

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}

}
