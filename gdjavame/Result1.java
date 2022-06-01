// Program to print the value of First name,Last name,Age,Gender,Address;:
import java.io.*;
class TestBean{ //clas define
	private String First_name;   //global variable
	private String Last_name;
	private String Age;
	private String Gender;
	private String Address;
	
	public void setFName( String First_name) {  //setter method
	
		this.First_name=First_name; //assign local to global	
	}
	public String getFName(){ //getter with no  arguments
		return First_name;
	}
	public void setLName( String Last_name){
		this.Last_name=Last_name;
	}
	public String getLName(){
		return Last_name;
	}
	public void setAname( String Age){
		this.Age=Age;
	}
	public String getAname(){
		return Age;
	}
	public void setGname( String Gender){
		this.Gender=Gender;
	}
	public String getGname(){
		return Gender;
	}
	public void setDname( String Address){
		this.Address=Address;
	}
	public String getDname(){
		return Address;
	}
	public void display(){
		System.out.println(First_name);
		System.out.println(Last_name);
		System.out.println(Age);
		System.out.println(Gender);
		System.out.println(Address);
	}
}
class Result1{
	public static void main(String[] args){
	TestBean tb=new TestBean();
	tb.setFName("Gajanan");
	tb.getFName();
	tb.setLName("Deshmukh");
	tb.getLName();
	tb.setAname("22");
	tb.getAname();
	tb.setGname("Male");
	tb.getGname();
	tb.setDname("Jadhavwadi");
	tb.getDname();
	tb.display();
	}
}
