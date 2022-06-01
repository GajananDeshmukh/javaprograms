// row=4 column =ith value print= star

package demo.loops;


public class Starforloop {
    public static void main(String[] args) {
        int r=4;
       
        
        
        for(int i=1;i<=r;i++){
             for(int j=1;j<=i;j++){
                 System.out.print("*");
             } 
             System.out.println();
        }
        
    }
}
