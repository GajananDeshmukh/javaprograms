
package demo.exception;
import java.util.*;
public class Throwdemo {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("please enter the value of age ");
        int age=scn.nextInt();
        if(age<18){
            throw new ArithmeticException("He/she is not eligible for voting ");
            
                    
            
        }
        else{
            System.out.println("He/she is eligible for voting ");
        }
    }
}
