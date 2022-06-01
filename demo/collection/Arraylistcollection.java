package demo.collection;

import java.util.*;

public class Arraylistcollection {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();//creating array list 
        list.add("gaju");//affing value in array
        list.add("parshya ");
        list.add("jojo ");

        Iterator tr = list.iterator();
        while (tr.hasNext()) {
            System.out.println(tr.next()
            );

        }
    }

}
