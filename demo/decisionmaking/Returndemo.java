
package demo.decisionmaking;
public class Returndemo {
    void returndemo(){
        boolean t=true;
        System.out.println("Before the return...");
        if(t){
            return;
        }
        System.out.println(" this wont be executed");
    }
}
