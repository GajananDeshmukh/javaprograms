package demo.inheritanceserideserilization;

import java.io.*;
import java.util.Scanner;

public class Serializationinheritance {

    public static void main(String[] args) {
        Project p = new Project();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first name of person");
        p.fname = sc.next();
        System.out.println("Enter last name of person");
        p.lname = sc.next();
        System.out.println("enter address of person");
        p.address = sc.next();
        System.out.println("enter age of person");
        p.age = sc.nextInt();

        System.out.println("Enter company name ");
        p.companymame = sc.next();
        System.out.println("enter id of employee");
        p.id = sc.nextInt();
        System.out.println("enter salary of employee in lakh");
        p.salary = sc.nextInt();

        System.out.println("enter department name");
        p.departmentname = sc.next();
        System.out.println("enter bo of employee");
        p.noofemployee = sc.nextInt();

        System.out.println("enter project name");
        p.projectname = sc.next();
        System.out.println("enter project duration");
        p.duration = sc.nextInt();
        try {
            FileOutputStream fileout = new FileOutputStream("C:\\Users\\student\\Documents\\NetBeansProjects\\personinfo.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileout);
            out.writeObject(p);
            out.close();
            fileout.close();
            System.out.println("Serialized deta is saved in file");

        } catch (IOException i) {
            i.printStackTrace();

        }
    }
}
