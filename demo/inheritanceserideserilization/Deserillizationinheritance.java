package demo.inheritanceserideserilization;

import java.io.*;

public class Deserillizationinheritance {

    public static void main(String[] args) {
        Project e = null;

        try {
            FileInputStream fileIn = new FileInputStream("C:\\Users\\student\\Documents\\NetBeansProjects\\personinfo.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            e = (Project) in.readObject();
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
        System.out.println("Deserialized personinfo....");
        
    }

}

