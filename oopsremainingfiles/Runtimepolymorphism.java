class Parent {
    void print() {
            System.out.println(" parent class");
    }
}
class Child1 extends Parent{
        void print() {
            System.out.println(" class child1 ");
        }
}
class Child2 extends Parent{
        void print(){
            System.out.println(" class child2 ");
        }
}
public class Runtimepolymorphism {
    public static void main(String[] args) {
      Parent a;
      a=new Child1();
      a.print();
      
      a=new Child2();
      a.print();
      
    }
    
}
