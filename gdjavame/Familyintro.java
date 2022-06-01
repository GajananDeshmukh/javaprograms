// how to call default function
import java.io.*;
class Default{
	int e, f;
	String a, b, c, d;
	Default(){
		System.out.println( " General information of my family is : ");
		}
	Default(String a, String b, int e, String c, String d, int f){
		this.a=a;
		this.b=b;
		this.e=e;
		this.c=c;
		this.d=d;
		this.f=f;
		}
	void display(){
		System.out.println( " first name " +a + " last name " +b);
		System.out.println( " age " +e);
		System.out.println(" address " +c);
		System.out.println(" occupation " +d);
		System.out.println( " Mobile no. " +f);
		}
}
class Familyintro{
	public static void main(String[] args){
		Default d1=new Default();
		Default d2=new Default( " Gajanan ", " Deshmukh ", 20, " gokul nagar jadhavwadi aurangabad " , " student ", 7888);
		Default d3=new Default(" Bhagawanrao ", " Deshmukh ", 57,  " gokul nagar jadhavwadi aurangabad " , " Driver ", 7028);
		Default d4=new Default(" Vaishali ", " Deshmukh ", 50, " gokul nagar jadhavwadi aurangabad " , " Driver ", 7058);
		d2.display();
		d3.display();
		d4.display();
	}		
}
		
		