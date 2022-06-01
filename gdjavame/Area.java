// write a program to calculate the area of rectangle, square, circleand triangle with the help of constructor 
import java.io.*;
class Show{
	int a,b,c,d,h,i;
	double e,f;
	Show(){
		System.out.println( " program to calculate differrent entities " );
	}
	Show(int a, int b, int c){
	        	this.a=a;
		this.b=b;
		this.c=a*b;
		this.d=a*a;
		this.e=(3.14)*(a*a);			
		
	}
	Show(int a, int b){
		this.h=a;
		this.i=b;
		this.f=(h*i)*0.5;	
	}
	void display(){
		System.out.println( " Area of rectangle having side a and side b is " +c );
		System.out.println( " Area of square having side a is " +d );
		System.out.println( " Area of circle of side a is " +e );
		}
	void print(){
		System.out.println( " Area of triangle of side a and b is " +f );
		}
}
class Area{
	public static void main (String[] args){
		Show s1=new Show();
		Show s2=new Show(20, 10, 30);
		Show s3=new Show(50, 50);
		s2.display();
		s3.print();
		
		
	}
}

		



