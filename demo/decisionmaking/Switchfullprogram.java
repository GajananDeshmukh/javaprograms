
package demo.decisionmaking;
public class Switchfullprogram {
    int a=60,b=30,c;
    int choice=5;
    public void output(){
    switch (choice){
        case 1:
            c=a+b;
            System.out.println(" Addition of and b is " +c);
            break;
        case 2:
            c=a-b;
            System.out.println(" Substraction of and b is " +c);
            break;
        case 3:
            c=a*b;
            System.out.println(" Multiplication of and b is " +c);
            break;
        case 4:
            c=a/b;
            System.out.println(" Division of and b is " +c);
            break;
        case 5:
            if(a>0 && a%2==0){
                System.out.println(" number is even ");}
            else {
                System.out.println("number is not even ");
            }
                break;
            
    
        case 6:
              if(a>0 && a%2!=0){
                System.out.println(" number is odd ");
             
            }
            else {System.out.println("number is not odd ");}
            break;
        case 7 :    if(a>0 && a%4==0){
                System.out.println(" year is leap ");
               
            } 
                  else {System.out.println(" year is not leap");}
                  break;
        default:
                System.out.println(" invalid number  ");
            
        
    }
    
    }
}

