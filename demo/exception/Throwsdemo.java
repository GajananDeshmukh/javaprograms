package demo.exception;
import java.io.*;
import java.util.*;
class Throwsexceptiondemo {
 void Testmethod(int num ) throws IOException,ArithmeticException{
     if(num==1)
         throw new IOException("Ioexceptuion occuresd");
         else 
         throw new ArithmeticException("Arithematic exception occured");
 }
}
public class Throwsdemo{
    public static void main(String[] args) {
        try{
            Scanner scn=new Scanner(System.in);
            System.out.println("enter the value to check");
            int num=scn.nextInt();
           Throwsexceptiondemo obj=new Throwsexceptiondemo();
           obj.Testmethod(num);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
