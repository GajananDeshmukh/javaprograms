package demo.concurrentthreads;

import java.util.concurrent.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class NewFixedthreadpooldmo {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(10);//Thread which are already sumitted
        //cast te object tpo its class type
        ThreadPoolExecutor pool = (ThreadPoolExecutor) executor;

//states before task exeution
        System.out.println("Largest execution .." + pool.getLargestPoolSize());
        System.out.println("maxmimum allowed threads " + pool.getMaximumPoolSize());
        System.out.println("Currents thread in pools... " + pool.getPoolSize());
        System.out.println("currently executing threads .. " + pool.getActiveCount());
        System.out.println("Total number of treas eve scheduled...." + pool.getTaskCount());
        System.out.println("");

        executor.submit(new Task());
        executor.submit(new Task());
        executor.submit(new Task());
        executor.submit(new Task());
        executor.submit(new Task());
        executor.submit(new Task());
        executor.submit(new Task());
        executor.submit(new Task());
        executor.submit(new Task());
        executor.submit(new Task());

        System.out.println("States after task execution ");
        System.out.println("Core thrteads " + pool.getCorePoolSize());
        System.out.println("Largest execution .." + pool.getLargestPoolSize());
        System.out.println("maxmimum allowed threads " + pool.getMaximumPoolSize());
        System.out.println("Currents thread in pools... " + pool.getPoolSize());
        System.out.println("currently executing threads .. " + pool.getActiveCount());
        System.out.println("Total number of treas eve scheduled...." + pool.getTaskCount());
    
        executor.shutdown();

    }
    static class Task implements Runnable {
    public void run(){
        try {
            Long duration =(long) (Math.random() * 10);
            System.out.println("Running Task!" + Thread.currentThread().getName());
            
            TimeUnit.SECONDS.sleep(duration);
            System.out.println("Completetd Task!" + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
}
