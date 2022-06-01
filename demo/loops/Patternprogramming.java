// row=4 column=5 print= value of each row
package demo.loops;


public class Patternprogramming {
    public static void main(String[] args) {
        int r=4;
        int c=5;
        
        for(int i=1;i<=r;i++){
             for(int j=1;j<=c;j++){
                 System.out.print(i);
             } 
             System.out.println();
        }
        
    }
}
