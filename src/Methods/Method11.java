package Methods;

public class Method11 {

	public static void main(String[] args) {

		Method11.studentname("Rahul");
		Method11.studentname("Ketan");
		
		Method11.studentinfo("Tom", 111);
		addition(10,30,22);
		
	}
	
	public static void studentname(String name) {
		
		
		System.out.println("Studentname :"+name);
	}
	
	public static void studentinfo(String name , int rollno) {
		
		System.out.println("Studentinfo :"+name+" "+rollno);
	}
	
	public static void addition(int i ,int j, int k ) {
		
		int sum =i+j+k;
		System.out.println(sum);
	}

}
