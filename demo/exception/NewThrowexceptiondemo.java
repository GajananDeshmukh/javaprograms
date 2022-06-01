package demo.exception;

public class NewThrowexceptiondemo {

    void arithematic() {
        try {
            int a = 10 / 0;
            throw new ArithmeticException(" Arithematioc exceptiom handle");
        } catch (ArithmeticException e) {
            System.out.println("Arithematic exception cauht inside arithemtic ");
            throw e;
        }
    }

    static void fun() {
        try {
            System.out.println("hello");

            // throw new NullPointerException("Null point exception demo");
        } catch (NullPointerException e) {
            System.out.println("caughtinside fun()");
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            fun();
            NewThrowexceptiondemo tcs = new NewThrowexceptiondemo();
            tcs.arithematic();
        } catch (NullPointerException e) {
            System.out.println("caught in main");
        } catch (ArithmeticException e) {
            System.out.println("This is also execution");
        }

    }
}
