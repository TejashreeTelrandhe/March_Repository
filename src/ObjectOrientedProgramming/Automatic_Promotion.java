package ObjectOrientedProgramming;

public class Automatic_Promotion {
// 
	public static void main(String[] args) {
		Automatic_Promotion AP = new Automatic_Promotion();
		AP.method1();//Zero input parameter
		AP.method1(127);//int input parameter
		AP.method1(2);//int input parameter
		AP.method1('a');//char input parameter
		AP.method1(111);//int input parameter
		AP.method1(456l);//long input parameter
		AP.method1(15.56f);//float input parameter
		AP.method1(45.65);//double input parameter
	}
public void method1() {
	System.out.println("Zero input parameter");
}
public void method1(byte B) {
	System.out.println("byte input parameter");
}
public void method1(short S) {
	System.out.println("short input parameter");
}
public void method1(char C) {
	System.out.println("char input parameter");
}
public void method1(int I) {
	System.out.println("int input parameter");
}
public void method1(long L) {
	System.out.println("long input parameter");
}
public void method1(float F) {
	System.out.println("float input parameter");
}
public void method1(double D) {
	System.out.println("double input parameter");
}
}
