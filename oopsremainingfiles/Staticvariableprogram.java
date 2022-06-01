class Operation{
    static int sum,sub,mul,div;
    static int a=50;
    static int b=60;
    static int c=70;
    static void operant(){
        sum=a+b+c;
        System.out.println(" addition of variabble befor  " +sum);
        sub=a-b;
        System.out.println(" substraction  of variabble  " +sub);
        mul=a*b;
        System.out.println(" multiplication of  " +mul);
        div=c/a;
        System.out.println(" division of variabble " +div);
    }
    static void changevalue(){
       System.out.println("  to display static operation after change values ");
        a=80;
        b=90;
        c=75;
       
    }
    static {
        System.out.println(" this program is usd to display static operation ");
         System.out.println(" to display static operation before change values ");
    }
}
public class Staticvariableprogram {
    public static void main(String[] args) {
     //   Operation or=new Operation();
       // or.disp();
        //or.operant();
        Operation.operant();//classname.methodname tocall without object created
        Operation.changevalue();
        Operation.operant();
    }
}
