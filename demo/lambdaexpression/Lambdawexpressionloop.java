
package demo.lambdaexpression;
import java.util.*;
public class Lambdawexpressionloop {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("gaju");
        list.add("jojo");
        
        list.forEach((n)->System.out.println(n));
    }
}
