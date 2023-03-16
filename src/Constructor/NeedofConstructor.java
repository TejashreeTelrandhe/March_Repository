package Constructor;


public class NeedofConstructor {
	
	// Purpose of the constructor 
	//1. The constructor is specially designed to perform initialization of object
	//it is a special type of method which is used to initialize the object.
	
	String name ; //Null
	int rollno;   //0
	
	public NeedofConstructor(String name,int Rollno){
		
		System.out.println(name+" "+Rollno);
		
	}
	
	public static void main(String[] args) {

		NeedofConstructor s1 = new NeedofConstructor("Rohit",22);
		
		NeedofConstructor s2 = new NeedofConstructor("Rahul",33);
		
		NeedofConstructor s3 =new NeedofConstructor("Ketan",44);
				
		NeedofConstructor s100 = new NeedofConstructor("Sachine",55);

	}

}