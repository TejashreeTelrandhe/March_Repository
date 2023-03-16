package JavaBasics;

public class Operator {

	public static void main(String[] args) {
double d1 = 85.65;
double d2 = 63.75;
//Arithmetic operator --> +,-,*,/,%
System.out.println("Arithmetic add operator : "+(d1+d2));//149.40
System.out.println("Arithmetic sub operator : "+(d1-d2));//21.900000000000006
System.out.println("Arithmetic mul operator : "+(d1*d2));//5460.1875
System.out.println("Arithmetic div operator : "+(d1/d2));//1.3435294117647059
System.out.println("Arithmetic mod operator : "+(d1%d2));//21.900000000000006
System.out.println();

//Logical Operator --> && , ||
boolean b1 = true;
boolean b2 = false;
boolean b3 = true;
System.out.println("Logical and Operator : "+(b1&&b2));//false
System.out.println("Logical or Operator : "+(b1||b2));//true
System.out.println("Logical and Operator : "+(b1&&b3));//true
System.out.println("Logical or Operator : "+(b1||b3));//true
System.out.println();

//Relational Operator --> >,<,==,!=,<=,>=
System.out.println("Relational > operator : "+(d1>d2));//true
System.out.println("Relational < operator : "+(d1<d2));//false
System.out.println("Relational == operator : "+(d1==d2));//false
System.out.println("Relational != operator : "+(d1!=d2));//true
System.out.println("Relational <= operator : "+(d1<=d2));//false
System.out.println("Relational >= operator : "+(d1>=d2));//true
System.out.println();

//Incremental Decremental Operator --> ++, --
d1++;
System.out.println("Incremental Operator : "+d1);//86.65
d2--;
System.out.println("Decremental Operator : "+d2);//62.75
System.out.println();

//Assign Operator --> =
String name = "Assign";
String Oname = name;
System.out.println("Assign Operator : "+Oname);//Assign

	}

}
