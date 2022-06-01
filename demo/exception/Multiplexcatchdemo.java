package demo.exception;
import java.util.Scanner;
public class Multiplexcatchdemo {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the value of a");
            int a = sc.nextInt();
              System.out.println("enter the value of b");
            int b = sc.nextInt();
            int myarray[] = new int[5];
            myarray[5] = a / b;
            System.out.println(myarray[5]);
            System.out.println(myarray[6]);
        } /*catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception : " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Exception : " + e.getMessage());
        }
*/
        catch(Exception e){ //general exception method execute to 
            System.out.println("Exception ; " +e.getMessage());
        }
    }
    
}
