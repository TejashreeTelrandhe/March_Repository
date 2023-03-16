package Methods;

public class Method12 {

	public static void main(String[] args) {
    //  static regular method with parameter	-   String , int , char , float
	//	studentname , rollno, grade , percentage
		
		Method12.studentinfo("Rohit", 20, 'A', 22.33f);	
		Method12.studentinfo("ketan", 30, 'v', 55.33f);	

	}	
	public static void studentinfo(String studentname, int rollno ,char grade, float percentage) {
				
	System.out.println("Studentname :"+studentname+" "+"Roll no :"+rollno+" "+"Grade :"+grade+" "
	+"Percenatge :"+percentage);	
	}

}
