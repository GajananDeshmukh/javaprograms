package demo.thread;

public class Threaddemo {

    public static void main(String[] args) {
        Thread1 t1 = new Thread1("Running Thread 1 ......");
        Thread2 t2 = new Thread2("Running Thread 2 ......");

        t1.start();
        t2.start();
    }

}
