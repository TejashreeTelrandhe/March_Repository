package Collection;

import java.util.LinkedList;

public class LinkedList1 {
	
	public static void main(String[] args) {
		
		LinkedList LL =new LinkedList();   // Hetro
		
		LinkedList<String> LL1 =new LinkedList<String>();  //Homo
		
		//Addding and inserting element in LL
		
		LL.add(200);
		LL.add("Welcome");
		LL.add(20.4);
		LL.add('A');
		LL.add(null);
		LL.add(true);
		
		System.out.println(LL);
		
		// Size
		System.out.println(LL.size());
		
		//Remove
		LL.remove(20.4);
		System.out.println(LL);
		
		//3.Add element in the LL		
		LL.add(3,"Java");
		System.out.println(LL);
		
		//4. get();		
		System.out.println(LL.get(5));
		
		//5.Firstindex		
		System.out.println(LL.getFirst());
		
		//6>lastIndex		
		System.out.println(LL.getLast());
				
}
}