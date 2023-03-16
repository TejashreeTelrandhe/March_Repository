package ObjectOrientedProgramming;

public class Encapsulation_SC {
	private String name;
	private int rollno;
	private String project;
	private char grade;

	public static void main(String[] args) {
		Encapsulation_SC E1 = new Encapsulation_SC();
		E1.setName("Tejashree");
		E1.setRollno(101);
		E1.setProject("Investment banking");
		E1.setGrade('A');
		System.out.println(E1.getName());
		System.out.println(E1.getRollno());
		System.out.println(E1.getProject());
		System.out.println(E1.getGrade());
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the rollno
	 */
	public int getRollno() {
		return rollno;
	}

	/**
	 * @param rollno the rollno to set
	 */
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	/**
	 * @return the project
	 */
	public String getProject() {
		return project;
	}

	/**
	 * @param project the project to set
	 */
	public void setProject(String project) {
		this.project = project;
	}

	/**
	 * @return the grade
	 */
	public char getGrade() {
		return grade;
	}

	/**
	 * @param grade the grade to set
	 */
	public void setGrade(char grade) {
		this.grade = grade;
	}

}
