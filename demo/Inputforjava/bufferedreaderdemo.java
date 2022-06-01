
package demo.Inputforjava;
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
       public class bufferedreaderdemo { 
           public static void main(String[] args) throws IOException{
               InputStreamReader isr= new InputStreamReader(System.in);
               BufferedReader br =new BufferedReader(isr);
               
               System.out.println(" Enter the id ");
               int id = (int) (Integer.parseInt(br.readLine()));
               
               System.out.println(" Enter the name ");
               String name = br.readLine();
               
                System.out.println(" Enter the age  ");
               int age = (int) (Integer.parseInt(br.readLine()));
               
                System.out.println(" Enter the salary ");
                String salary = br.readLine();
                
                System.out.println(" Enter the post ");
                String post = br.readLine();
                
               System.out.println(" Enter the address ");
                String address = br.readLine();
                
                Employee emp=new Employee(id, name, age, age, post, address);
                emp.displayDetails();
                        
                        
               
           }
    }

