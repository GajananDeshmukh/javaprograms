package demo.stringprograms;
public class Charatdemo {
    void display(){
        String str="gajanan Deshmukh ";
        System.out.println(str.charAt(2));
        
        for(int i=0;i<str.length()-1;i++){
            if(i%2!=0){
                System.out.println("Char at " + i + " : " + str.charAt(i));
            }
        }
    }
}
