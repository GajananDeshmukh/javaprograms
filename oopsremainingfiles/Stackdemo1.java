import java.util.*;
import java.io.*;
public class Stackdemo1 {
    static void stack_push(Stack<Integer> stack){
        for( int i = 5; i < 10; i++){
           stack.push(i);
            
    }
       System.out.println(stack); 
    }
    static void stack_pop(Stack<Integer> stack){
        for( int i = 5; i < 10; i++){
            Integer y=(Integer)stack.pop();
            System.out.print(y);
        }
    }
    static void stack_peek(Stack<Integer> stack){
        Integer element=(Integer)stack.peek();
        System.out.println( " element on top of stack is " +element);
    }
    static void stack_search(Stack<Integer> stack, int element ){
        Integer pos=(Integer)stack.search(element);
        if(pos==-1)
            System.out.println(" element is not found ");
        else 
            System.out.println(" elemnet is found " +pos );
        
    }
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<Integer>();
        stack_push(stack);
        stack_pop(stack);
        stack_push(stack);
        stack_peek(stack);
        stack_search(stack, 2);
        stack_search(stack, 8);
    }
}
