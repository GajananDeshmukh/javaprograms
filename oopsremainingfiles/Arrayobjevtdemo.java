// to crate array with the help of object 
class Student{
    int rollno;
    String name;
    
    public Student (int rollno, String name){
        this.rollno=rollno;
        this.name=name;
    }
}


public class Arrayobjevtdemo {
    public static void main(String[] args) {
        Student student[]; // create array as a bobject //class and object 
        student =new Student[5];
        student[0]=new Student(1, " Gajanan ");
        student[1]=new Student(2, " jojo ");
        student[2]=new Student(3, " chilwant ");
        student[3]=new Student(4, " parshya  ");
        student[4]=new Student(5, " dipya ");
        
        for(int i=0;i<student.length;i++){
        System.out.println(" element at index is" +i + " roll no. is  " +student[i].rollno + " name of student  "+ student[i].name);
    }
    }
} 

