
package demo.InOutstream;
import java.io.FileOutputStream;
public class FileOutputstreamdemo {
    public static void main(String[] args) {
        try {
            FileOutputStream fos=new FileOutputStream("C:\\Users\\student\\Documents\\NetBeansProjects\\testdemo.text");
            String s="Welcome fuel";
            byte b[]=s.getBytes();//coverting string file into byte type 
            fos.write(b);
            fos.close();
            System.out.println("Success....");
        } catch (Exception e) {
            System.out.println(e  );
        }
    }
}
                                                                                                                                            