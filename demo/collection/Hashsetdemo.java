package demo.collection;

import java.util.*;

public class Hashsetdemo {

    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Amol");
        hs.add("Amol");
        hs.add("Amit");
        hs.add("Radha");
        hs.add("Kunal");
        hs.add("kunal");

        hs.add(" ");
        hs.add("");
        // System.out.println(hs.toString());
        Iterator itr = hs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());

        }
          HashSet<String> hs1 = new HashSet<>();
          hs1.addAll(hs);
          hs1.add("");
          hs1.add("45");
          hs1.add("25");
          hs1.add("426");
          System.out.println(hs1.toString());
          
          boolean value = hs1.remove("25");
          System.out.println("is three reomved " + value);
          System.out.println(hs1);
          
              
          boolean value1 = hs.removeAll(hs);
          System.out.println("is hs reomved " + value1);
          System.out.println(hs);
          
    }
}
