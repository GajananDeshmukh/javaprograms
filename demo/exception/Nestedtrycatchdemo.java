package demo.exception;

public class Nestedtrycatchdemo {

    public static void main(String[] args) {
        try {
            int arr[] = new int[5];
            arr[5] = 10;
            System.out.println("Inside outer try block");
            //try block 1
            try {
                System.out.println("Try block 1");
                int num = 15 / 0;
                System.out.println(num);
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
            // try block 2
            try {
                System.out.println(" try block 2");
                int num = 100 / 0;
                System.out.println(num);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("After block 1 and  block 2");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
