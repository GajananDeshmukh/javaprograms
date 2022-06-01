// Program to print the value of name;:
import java.io.*;
class TestBean{ //clas define
	private String name;   //global variable
	public void setName(String name){  //setter method
	
		this.name=name; //assign local to global	
	}
	public String getName(){ //getter with no  arguments
		return name;
	}
	public void display(){
		System.out.println(name);
	}
}
class Result{
	public static void main(String[]args){
	TestBean tb=new TestBean();
	tb.setName("Gajanan Deshmukh");
	tb.display();
	}
}
	