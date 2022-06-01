
import java.util.concurrent.*;
import java.util.*;
import java.io.*;
public class Schedulefdexcutordemo {
    public static void main(String[] args) {
        System.out.println("A count down program  ");
        
        //creating a scheuledexecutive service 
        ScheduledExecutorService scheduler=Executors.newScheduledThreadPool(20);
        
        //printing the current time
        System.out.println("Current time : " + Calendar.getInstance().get(Calendar.SECOND));
          
        //Scheduling the task
        for (int i = 10; i>=0;i--){
            scheduler.schedule(new Task(i), 10-i , TimeUnit.SECONDS);
            
        }
        scheduler.shutdown();
        
    }
   static  class Task implements Runnable{
        private int num;
        public Task (int num){
            this.num=num;
        }
        public void run(){
            System.out.println("Number " + " Current time " + Calendar.getInstance().get(Calendar.SECOND));
        }
    }
}
