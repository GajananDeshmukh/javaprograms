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
class Three extends Two{
     public void printthree(){
            System.out.println(" three class is called ");
     }
}
class Four extends Three{
     public void printfour(){
            System.out.println(" four class is called ");
     }
}
public class Multilevelinheritance {
    public static void main(String[] args) {
        Four f=new Four();
        f.printone();
        f.printtwo();
        f.printthree();
        f.printfour();
    }
}
