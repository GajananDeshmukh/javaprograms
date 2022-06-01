package demo.serialization;

import java.io.*;

public class Deserializationdemo {

    public static void main(String[] args) {
        Employee e = null;

        try {
            FileInputStream fileIn = new FileInputStream("C:\\Users\\student\\Documents\\NetBeansProjects\\employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            e = (Employee) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("Serialized deta is saved in file");

        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Employee class nt found ");
            c.printStackTrace();
            return;
        }
        System.out.println("Deserialized emplpoyee....");
        System.out.println("Name :" + e.name);
        System.out.println("Address :" + e.address);
        System.out.println("id :" + e.id);
        System.out.println("age :" + e.age);
    }

}
