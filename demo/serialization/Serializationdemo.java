package demo.serialization;

import java.io.*;

public class Serializationdemo {

    public static void main(String[] args) {
        Employee e = new Employee();
        e.name = "gaju deshmukh";
        e.address = "plot no.48";
        e.id = 20;
        e.age = 21;

        try {
            FileOutputStream fileout = new FileOutputStream("C:\\Users\\student\\Documents\\NetBeansProjects\\employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileout);
            out.writeObject(e);
            out.close();
            fileout.close();
            System.out.println("Serialized deta is saved in file");

        } catch (IOException i) {
            i.printStackTrace();

        }
    }

}
