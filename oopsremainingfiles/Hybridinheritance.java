import java.io.*;
import java.util.*;
class One{
        public void printone(){
            System.out.println(" one class is called ");
        }
}
class Two extends One{
         public void printtwo(){
            System.out.println(" two class is called ");
         }
}
class Three extends One{
     public void printthree(){
            System.out.println(" three class is called ");
     }
}
class Four extends Two{
     public void printfour(){
            System.out.println(" four class is called ");
     }
}
public class Hybridinheritance {
    public static void main(String[] args) {
        Four f=new Four(); // multilevel inheritance
        f.printone();
        f.printfour();    
        f.printtwo();
      
        Three t=new Three(); //Hierachical inheritance
        t.printthree();
        t.printone();
    }
}

