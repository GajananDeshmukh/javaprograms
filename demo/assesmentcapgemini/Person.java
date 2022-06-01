
package demo.assesmentcapgemini;

public class Person {
    String firstname;
    String lastname;
    Person(String firstname,String lastname)
    {
        this.firstname=firstname;
       
         this.lastname=lastname;
       
    }
    public String getFirstname(){
        return firstname;
    }
    public String getLastname(){
        return lastname;
    }
}