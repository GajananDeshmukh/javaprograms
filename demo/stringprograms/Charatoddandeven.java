
package demo.stringprograms;
public class Charatoddandeven {
    void display(){
        String str="gajanan Deshmukh ";
        
        for(int i=0;i<str.length()-1;i++){
            if(i%2!=0){
                System.out.println("Char at of odd numbers " + i + " : " + str.charAt(i));
            }
        }
        System.out.println("");
        
        
              for(int i=0;i<str.length()-1;i++){
            if(i%2==0){
                System.out.println("Char at of even  numbers " + i + " : " + str.charAt(i));
                
             
                       
}
        }
                  
                System.out.println("Length of string is : " + str.length());
    }
}
    
    