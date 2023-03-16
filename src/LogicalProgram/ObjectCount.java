package LogicalProgram;

public class ObjectCount {
	public static int count;
	
	public ObjectCount(){
		count++;
		}

//	Object count
	public static void main(String [] args){

		ObjectCount c1 = new ObjectCount();
		ObjectCount c2= new ObjectCount();
		ObjectCount c3= new ObjectCount();

	System.out.println("Number of times object is intialized = "+count);

}
}
