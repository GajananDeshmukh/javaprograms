// java program for demonstrate accesing of eelement from the stack
// push
// peek
import java.util.*;
import java.io.*;
public class Stackdemo {
    public static void main(String[] args) {
        Stack<String>s=new Stack<String>();
        s.push(" Welcome ");
        s.push(" Fuel ");
        s.push(" Organization ");
        s.push(" Pune ");
        System.out.println(" intial stack is : " +s);
        System.out.println(" the element of the top f the stack is " +s.peek());
    }
}
