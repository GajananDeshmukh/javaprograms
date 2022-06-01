interface Printable{
    void print();
}

class Printing implements Printable{
    public void print(){
            System.out.println(" print java  progress");
    }
}
public class Interfacedemo {
    public static void main(String[] args) {
        Printing p1=new Printing();
        p1.print();
    }
   
}
