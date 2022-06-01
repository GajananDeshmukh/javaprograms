
package demo.concurrentthreads;
import java.util.concurrent.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
class Task implements Runnable {
    public void run(){
        try {
            Long duration = (long)(Math.random()* 20);
            System.out.println("Running Task..");
            TimeUnit.SECONDS.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class Newsinglethreadexcutor {
    public static void main(String[] args) throws InterruptedException {
      ExecutorService es = Executors.newSingleThreadExecutor();
      try {
          es.submit(new Task());
          System.out.println("Shutdown executor...");
          es.shutdown();
          
          es.awaitTermination(0, TimeUnit.SECONDS);
      }catch(InterruptedException e){
          System.out.println("Task interuppted ");
      }finally {
          if(!es.isTerminated()){
              System.out.println("Cancel non finished tASK...");
          }
      }
      es.shutdownNow();
        System.out.println("Shutdown is finished ...");
    }
}
