
package demo.collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Sortsetdemo {
    public static void main(String[] args) {
                SortedSet<Integer> lhs=new TreeSet<>();
        lhs.add(10);
        lhs.add(5);
        lhs.add(0);
        lhs.add(1);
        lhs.add(56);
        //lhs.add(" ");
       // lhs.add(null);
        Iterator itr = lhs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());

        }
    }
    }

