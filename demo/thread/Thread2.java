
package demo.thread;
public class Thread2 extends Thread{
    String msg= " ";
    
    public Thread2(String msg){
        this.msg=msg;
    }
    public void run(){
        try{
            while(true){
                System.out.println(msg);
                Thread.sleep(200);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

