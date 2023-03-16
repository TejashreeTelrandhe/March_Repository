package Inheritance_Multilevel;

public class TestClass {

	public static void main(String[] args) {
		WhatsApp_V1 v1 =new WhatsApp_V1();
		v1.Textmsg();
		
		System.out.println();
		WhatsApp_v2  V2 =new WhatsApp_v2();
		V2.AudioCalling();
		V2.Textmsg();        
				
		System.out.println();
		WhatsApp_v3  V3 =new WhatsApp_v3();
		V3.VideoCalling();
		V3.Textmsg();
		V3.AudioCalling();
				
		System.out.println();
		
		WhatsApp_v4  V4 =new WhatsApp_v4();
		
		V4.Payment();
		V4.AudioCalling();
		V4.VideoCalling();
		V4.Textmsg();

	}

}
