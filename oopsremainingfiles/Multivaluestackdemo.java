import java.util.*;
import java.io.*;

public class Multivaluestackdemo {
    public static void main(String[] args) {
        Stack stack1=new Stack();
        Stack<String> stack2=new Stack<String>();
        stack1.add(1);//add=push
        stack1.add(" Fuel ");
        stack1.add(10.11f);
        stack1.add(" ");
        
        stack2.add(" Deogiri COE ");
        stack2.add(" Aurangabad ");
        stack2.add(" Mumbai ");
        
        System.out.println(stack1);
        System.out.println(stack2);
            
        stack1.pop();//pop deletes last item
        stack1.pop();
        System.out.println(stack1);
        System.out.println(stack1);
       
        System.out.println(stack2.peek()); // returns laat enetered value
        System.out.println(stack2.peek()); 
        System.out.println(stack2);
        
         System.out.println(stack1.empty());// check if it is empty true or false
         
          System.out.println(stack2.search(" Mumbai "));
          System.out.println(stack2.search(" Deogiri COE ")); 
          System.out.println(stack2.search(" Aurangabad "));
          
             System.out.println(stack2.pop());
    }
}
