
package demo.serialization;
public class Student implements java.io.Serializable{
    public String fname;
    public String lname;
     public String address; 
      public int percentage ;
      public int mobileno;
      public int rollno;
      
      public void mailcheck(){
          System.out.println("Mailing a check to"+ fname + " " +lname + " " +address + " " + percentage+ " " +mobileno + " " +rollno);
      }
}
    
