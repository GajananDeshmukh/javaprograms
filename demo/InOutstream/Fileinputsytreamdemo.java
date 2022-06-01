
package demo.InOutstream;
import java.io.FileInputStream;
public class Fileinputsytreamdemo {
    public static void main(String[] args) {
        try {
            FileInputStream fis=new FileInputStream("C:\\Users\\student\\Documents\\NetBeansProjects\\testdemo.text");
            System.out.println("data in the file");
            
            //read the first byte
            int i=fis.read();
            System.out.println(i);
            while(i!=-1){
                //prints int value and correspionding char value 
                System.out.print("int value " +i + " --");
                System.out.println((char)i);// typecast //it print ascii value 
                
                i=fis.read();
            
            }
            fis.close();
        } catch (Exception e) {
        }
    }
}
