
package demo.thread;
public class Thread1 extends Thread{
    String msg= " ";
    
    public Thread1(String msg){
        this.msg=msg;
    }
    public void run(){
        try{
            while(true){
                System.out.println(msg);
                Thread.sleep(100);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
