
package demo.lambdaexpression;
interface Sayble{
    public String say (String name, String working);
}


public class Lambdaexpressionsingleparamter {
    public static void main(String[] args) {
        Sayble s1 = (name, working)->{
            return "Hello, " + name + " it is " + working + " firm ";
        };
        System.out.println(s1.say("fuel, pune ", " java training "));
         Sayble s2 = (name, working)->{
            return "Hello, " + name + " it offers  " + working ;
         };
         System.out.println(s2.say("DIEMS", "b.tech") );
    }
 
}
