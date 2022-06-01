
package demo.assesmentcapgemini;
public class Inheritance {
    public static void main(String[] args) {
        Teacher tr=new Teacher(250000, 5, 52, "gajanan ", "deshmukh");
        System.out.println("teacher info is ");
        System.out.println("salary of teacher is " + tr.salary + " year started to work " + tr.stryear + " year of experience " + tr.yrexp + " first name is " + tr.firstname + " last name is " + tr.lastname);
    }
}
