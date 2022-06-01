
package demo.collection;
import java.util.*;
public class Linkedhasset {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs=new LinkedHashSet<>();
        lhs.add("10");
        lhs.add("5");
        lhs.add("0");
        lhs.add("1");
        lhs.add("56");
        lhs.add(" ");
        lhs.add(null);
        Iterator itr = lhs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());

        }
    }
}
