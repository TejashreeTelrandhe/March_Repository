package JavaBasics;

public class ControlStatement {

	public static void main(String[] args) {
//  Simple if statement
//		Executes when the condition is true
		int age = 25;
		if (age <= 30) {
			System.out.println("Age is below 30");//true
		}
//	If Else Statement
//		Executes when condition of if block is true or else block executes.
		String name = "Tejashree";
		if (name.equals("Tejashre")) {
			System.out.println("String matches");
		} else {
			System.out.println("String not matches");//true
		}

//	If Else If Statement
//		Used to compare more than two conditions
//		Executes when condition of if block or else if block is true or else block executes.
		double d = 85.65;
		if (d > 90.25) {
			System.out.println("Percent is grater than 90.25");
		} else if (d > 85.25) {
			System.out.println("Percent is greater than 85.25");//true
		} else if (d < 85.25) {
			System.out.println("Percent is less than 85.25");
		} else {
			System.out.println("Percent doesnot matches any condition");
		}
//	Nested If Statement
//		Used to validate combination of conditions
		int weight = 45;
		if (weight < 50) {
			if (weight == 45) {
				System.out.println("Weight is below 50 , it is 45");//true
			}
		} else if (weight > 50) {
			System.out.println("Weight is above 50");
		} else {
			System.out.println("Weight doesnot matches");
		}
//	Switch Statement
		String day = "Thurday";
		switch (day) {
		case "Monday":
			System.out.println("Monday");
			break;
		case "Tuesday":
			System.out.println("Tuesday");
			break;
		case "Wednesday":
			System.out.println("Wednesday");
			break;
		case "Thursday":
			System.out.println("Thursady");
			break;
		case "Friday":
			System.out.println("Friday");
			break;
		case "Saturday":
			System.out.println("Saturday");
			break;
		case "Sunday":
			System.out.println("Sunday");
			break;
		default:
			System.out.println("No match among 7 days of week");//true
		}
	}

}
