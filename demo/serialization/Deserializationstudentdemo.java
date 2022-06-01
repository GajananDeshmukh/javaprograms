package demo.serialization;

import java.io.*;

public class Deserializationstudentdemo {

    public static void main(String[] args) {
        Student s = null;

        try {
            FileInputStream fileIn = new FileInputStream("C:\\Users\\student\\Documents\\NetBeansProjects\\student.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            s = (Student) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("deSerialized deta is saved in file");

        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Employee class nt found ");
            c.printStackTrace();
            return;
        }
        System.out.println("Deserialized student....");
        System.out.println("fName :" + s.fname);
        System.out.println("lName :" + s.lname);
        System.out.println("Address :" + s.address);
        System.out.println("percentage :" + s.percentage);
        System.out.println("roll no :" + s.rollno);
        System.out.println("mobile no :" + s.mobileno);
    }

}
