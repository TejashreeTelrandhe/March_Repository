package Collection;

import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		Vector <Integer> VC =new Vector<Integer>();
		
		VC.add(2);
		VC.add(3);
		VC.add(5);
		VC.add(22);
		VC.add(15);
		VC.add(23);
		VC.add(11);
		VC.add(55);
		
		System.out.println(VC); // Print all the element
		
		System.out.println(VC.size());
		
	   VC.remove(3);
	   System.out.println(VC);
	   
	   VC.add(3,22);
	   System.out.println(VC);
	   
	   VC.set(3, 30);
	   System.out.println(VC);
		
	   for(int i=0 ;i<VC.size();i++) {
		   System.out.println(VC.get(i));
	   }
	   for(Integer i :VC) {		   
		   System.out.println(i);
	   }
	}
}