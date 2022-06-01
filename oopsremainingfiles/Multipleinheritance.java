import java.io.*;
import java.util.*;
class One{
        public void printone(){
            System.out.println(" one class is called ");
        }
}
class Two {
         public void printtwo(){
            System.out.println(" two class is called ");
         }
}
class Three extends One, Two {
     public void printthree(){
            System.out.println(" three class is called ");
     }
}
class Four extends One{
     public void printfour(){
            System.out.println(" four class is called ");
     }
}
public class Hierachicalinheritance {
    public static void main(String[] args) {
        Four f=new Four();
        f.printone();
        f.printfour();    
        
        Two t=new Two();
        t.printtwo();
        t.printone();
    }
}

public class Multipleinheritance {
    
}
