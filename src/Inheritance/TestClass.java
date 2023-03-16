package Inheritance;


import Inheritance_Multilevel.WhatsApp_V1;
import Inheritance_Multilevel.WhatsApp_v2;
import Inheritance_Multilevel.WhatsApp_v3;
import Inheritance_Multilevel.WhatsApp_v4;

public class TestClass {

	public static void main(String[] args) {

		Son S1 =new Son();
		
		S1.Mobile();
		S1.car();
		S1.Home();
		S1.Money();
		
		
		Father f1 = new Father();
		f1.car();
		f1.Home();
		f1.Money();
		
		
		System.out.println();
		
		kia k =new kia();
		
		k.automatic();
		k.start();
		k.Stop();
		k.Refuel();
		
		System.out.println();
		
	}

}
