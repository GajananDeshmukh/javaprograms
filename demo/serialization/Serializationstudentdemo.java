package demo.serialization;

import java.io.*;

public class Serializationstudentdemo {

    public static void main(String[] args) {
        Student  s = new Student();
        s.fname = "gaju ";
        s.lname= "deshmukh";
        s.address = "plot no.48";
        s.percentage = 20;
        s.mobileno = 21;
        s.rollno=15;

        try {
            FileOutputStream fileout = new FileOutputStream("C:\\Users\\student\\Documents\\NetBeansProjects\\student.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileout);
            out.writeObject(s);
            out.close();
            fileout.close();
            System.out.println("Serialized deta is saved in file");

        } catch (IOException i) {
            i.printStackTrace();

        }
    }

}
