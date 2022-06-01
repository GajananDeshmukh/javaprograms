class Pattern{
    // method with no argument
    public void display(){
        for(int i=0; i<10;  i++){
            System.out.print(" * ");
        }
       
    }

 // mathod wirth argument 
public void display(char var){
    for(int i=0; i<10;  i++){
        System.err.print(var);
}
}
}
public class Polymorphismoverloading {
    public static void main(String[] args) {
        Pattern p1=new Pattern();
        p1.display();
        System.out.println("");
        p1.display('#');
         System.out.println("");
    }
   
}
