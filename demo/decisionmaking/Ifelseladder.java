//main method is not included
package demo.decisionmaking;
public class Ifelseladder {
    void show() {
        System.out.println(" This program is used to diplay age group");
        double a=5.0;
    if(a>=0.0 && a<=125.0){
        if(a<= 12.0){
            System.out.println(" Age group is child ");
        }
        else if(a<=18.0){
             System.out.println(" Age group is adolescene ");
        }
          else if(a<=59.0){
             System.out.println(" Age group is adult ");
        }
   
         
    }
     else {
              System.out.println(" invalid input ");
          }
    }
    }