import java.util.ArrayList;


public class Autoboxingdemo {
    public static void main(String[] args) {
        char ch='a';
        int num=10;
        String str="FUEL PUNE  ";
        //AUTOBOXING
        Character a=ch;
        System.out.println(a);
        
        Integer b=num;
        System.out.println(b);
        
        String st=str;
        System.out.println(st);
        
        ArrayList<Integer>arrayList=new ArrayList<Integer>();
        arrayList.add(25);
        System.out.println(arrayList.get(0));
    }
}
