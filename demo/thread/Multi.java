
package demo.thread;
import java.lang.Thread;

/*public class Multi extends Thread{
    public void run(){
        System.out.println("Thread is running ....");
    }
    public static void main(String[] args) {
        Multi mi=new Multi();
        mi.start();
    }
}*/
public class Multi implements Runnable {
    public void run(){
        System.out.println("Thread is running ....");
    }
     public static void main(String[] args) {
        Multi mi=new Multi();
        Thread t=new Thread(mi);
        t.start();
     }
}