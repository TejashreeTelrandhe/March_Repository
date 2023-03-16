package Collection;

import java.util.HashSet;

public class HashSet2 {

	public static void main(String[] args) {
  
		HashSet<Integer>HS3 =new HashSet<Integer>();	//homo	  
		
		HS3.add(3);
		HS3.add(4);
		HS3.add(6);
		
		System.out.println(HS3);
		
		HashSet<Integer>HS4 =new HashSet<Integer>();
		HS4.addAll(HS3);
		System.out.println(HS4);
		
		HS4.removeAll(HS3);
		System.out.println(HS4);

	}

}