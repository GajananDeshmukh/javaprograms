
package demo.lambdaexpression;

    interface Drawable {
        public void draw();
    }
public class Withpoutlambdaexpression {
    public static void main(String[] args) {
        int w=10;
        Drawable dd=new Drawable (){
            public void draw(){
                System.out.println("Drawing " + w); 
            }
        };
        dd.draw();
    }
}
