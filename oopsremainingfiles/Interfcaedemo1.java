interface Drawable{
        void draw();
}
interface Printable{
        void print();
}
class Rectangle implements Drawable,Printable{
       public void draw(){
            System.out.println(" drawing rectangle ");
       }

       public void print(){
            System.out.println(" printing rectangle ");
}
}
class Circle implements Drawable,Printable{
    public void draw(){
            System.out.println(" drawing circle ");
       }

       public void print(){
            System.out.println(" printing circle ");
}
}
public class Interfcaedemo1 {
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.draw();
        r.print();
        
        Circle c=new Circle();
        c.draw();
        c.print();
    }
}
// multipole inheritance is used by program 