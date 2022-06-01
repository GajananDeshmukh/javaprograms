//main method is not included
package demo.decisionmaking;
public class Nestedif {
   void display() {
       System.out.println(" This program is used to show nested interface");
       int num=122;
    if(num>100){
        System.out.println(" number is greater than 100");
        if(num<120)
        {
            System.out.println(" number is less than 120");
        }
            else {
                    System.out.println(" number is greater  than 120");  
                    }
        if(num%2==0){
            System.out.println(" number is  divisible by 2");
        }
        else{
            System.out.println(" number is  not divisible by  by 2");
        }
    }  
    }
   
}
