package ObjectOrientedProgramming;

public class MethodOverloading_RTP {

	public static void main(String[] args) {
		MethodOverloading_RTP RTP = new MethodOverloading_RTP();
		RTP.mnc();
		RTP.mnc("2023");
		RTP.mnc(10);
		RTP.mnc("A", "B");
		RTP.mnc(10.25);
	}

	public void mnc() {
		System.out.println("Wipro Company");
	}

	public void mnc(String year) {
		year = "2.3 years";
		System.out.println("TCS Company , experience = " + year);
	}

	public void mnc(int salary) {
		salary = 45000;
		System.out.println("Capgemeini Company, salary = " + salary);
	}

	public void mnc(String project, String testing) {
		project = "Capital Equity Market";
		testing = "Automation testing";
		System.out.println("HCL Company, project = " + project + ", testing = " + testing);
	}

	public void mnc(double percentage) {
		percentage = 14.56;
		System.out.println("Wipro Company, hike percentage = " + percentage);
	}
}
