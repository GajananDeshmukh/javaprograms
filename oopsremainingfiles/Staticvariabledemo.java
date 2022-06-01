class Student{
    int rollno;
    String name;
    static String collegename=" DIEMS Aurangabad ";// static variable
    
    public Student(int rollno, String name){
        this.rollno=rollno;
        this.name=name;
    }
    static void changenamecollege() { //static method
         collegename= " GECA ";
    }
    void display(){
        System.out.println(rollno+ " " + name + " " + collegename);
    }
}
public class Staticvariabledemo {
    public static void main(String[] args) {
        //Student.changenamecollege();
        Student.changenamecollege(); //college name change
        Student s1=new Student(9, " gajanan deshmukh ");
        Student s2=new Student(21, " prathmesh chaudhari ");
        s1.display();
        s2.display();
    }
}
