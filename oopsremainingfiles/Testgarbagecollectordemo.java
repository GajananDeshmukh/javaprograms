
public class Testgarbagecollectordemo {
    public void finalize(){
        System.out.println(" object is garbage collected  ");
    }
    public static void main(String[] args) {
       Testgarbagecollectordemo t1=new    Testgarbagecollectordemo();
       Testgarbagecollectordemo t2=new    Testgarbagecollectordemo();
       t1=null;
       t2=null;
       System.gc();
    }
}
