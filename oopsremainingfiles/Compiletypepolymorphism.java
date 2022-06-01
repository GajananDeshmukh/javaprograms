class Helper {
    static int multiply(int a, int b){
            return a*b;
}
    static double multiply(double a, double b){
            return a*b;
    }
}
public class Compiletypepolymorphism {
    public static void main(String[] args) {
        Helper h=new Helper();
       /* int mul=h.multiply(25, 50);
        double muld=h.multiply(3.6, 10.25);
        System.out.println(" multiplication of intergerr " + mul);
        System.out.println(" multiplication of double " + muld);*/
        System.out.println(" multiplication of intergerr " + Helper.multiply(25, 50));
        System.out.println(" multiplication of intergerr " + Helper.multiply(3.6, 10.25));
        
    }
}
