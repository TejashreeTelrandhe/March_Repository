package JavaBasics;

public class UserDefinedConstructor {
String city;
int pincode;
String state;
	public UserDefinedConstructor() {
		System.out.println("Zero parameter constructor");
	}

	public UserDefinedConstructor(int rollno, String firstname) {
		System.out.println("Roll no = " + rollno + ", Name = " + firstname);
	}

	public UserDefinedConstructor(String college, String degree, String lastname) {
		System.out.println("College = " + college + ", Degree = " + degree + ", Lastname = " + lastname);
	}
	public UserDefinedConstructor(int a , int b) {
		a =15;
		b =25;
		System.out.println("Addition of two number = "+(a+b));
	}
	public UserDefinedConstructor(int num1 , int num2, int num3) {
		num1 =15;
		num2 =25;
		num3 =35;
		System.out.println("Multiplication of three number = "+(num1*num2*num3));
	}
	public UserDefinedConstructor(String city1,int pincode1,String state1) {
		city=city1;
		pincode = pincode1;
		state = state1;
		System.out.println("City = "+city);
		System.out.println("Pincode = "+pincode);
		System.out.println("State = "+state);
	}
	public static void main(String[] args) {
		UserDefinedConstructor UDC = new UserDefinedConstructor();
		System.out.println();
		UserDefinedConstructor UDC1 = new UserDefinedConstructor(1, "Tejashree");
		System.out.println();
		UserDefinedConstructor UDC2 = new UserDefinedConstructor("IOS", "MSC", "Telrandhe");
		System.out.println();		
		UserDefinedConstructor UDC3 = new UserDefinedConstructor(1,2);
		System.out.println();
		UserDefinedConstructor UDC4 = new UserDefinedConstructor(0,1,2);
		System.out.println();
		UserDefinedConstructor UDC5 = new UserDefinedConstructor("Nagpur",441203,"Maharashtra");

	}

}
