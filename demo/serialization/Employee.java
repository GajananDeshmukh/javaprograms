
package demo.serialization;
public class Employee implements java.io.Serializable{
    public String name;
     public String address; 
      public int id;
      public int age;
      
      public void mailcheck(){
          System.out.println("Mailing a check to"+ name + " " + address + " " + id + " " +age);
      }
}
