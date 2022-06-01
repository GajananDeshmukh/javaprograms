package demo.exception;

public class Throwexceptiondemo {

    static void fun() {
        try {
            throw new NullPointerException("Null point exception demo");
        } catch (NullPointerException e) {
            System.out.println("caughtinside fun()");
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            fun();
        } catch (Exception e) {
            System.out.println("caught in main");
        }
    }
}
