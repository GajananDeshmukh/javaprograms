package demo.Inputforjava;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

    class Employee {
        int id;
        String name;
        int age;
        double salary;
        String post;
        String address;

        public Employee(int id, String name, int age, double salary, String post, String address) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.salary = salary;
            this.post = post;
            this.address = address;
        }
        public void displayDetails(){
            System.out.println("Employe  id is " + this.id);
            System.out.println("Employee Name is " + this.name);
            System.out.println("Employee age is " + this.age);
            System.out.println("Employee salary  is " + this.salary);  
            System.out.println("Employee post is " + this.post);
            System.out.println("Employee Name is " + this.address); 
        }
    }  
       public class Scannerclassdemo { 
           public static void main(String[] args) throws IOException{
           Scanner input =new Scanner(System.in);
           System.out.println(" Enter the id ");
           int id=input.nextInt();
           
           System.out.println(" Enter the name ");
           String ib=input.next();
           
           System.out.println(" Enter the age  ");
            int ic=input.nextInt();
          
             System.out.println(" Enter the salary ");
            Double ik=input.nextDouble();
            
                 
             System.out.println(" Enter the post ");
             String il=input.next();
             
             System.out.println(" Enter the address ");
             String im=input.next();
             
            Employee emp=new Employee(id, ib, ic, ik, il, im);
            emp.displayDetails();
                        
             
           }
    }





