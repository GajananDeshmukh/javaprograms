/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author student
 */
package demo.lambdaexpression;

interface Drawable {

    public void draw();
}

public class Withlambdaexpression {
    public static void main(String[] args) {
        
    
    Drawable d2 = () -> {
        int w = 10;
        System.out.println("Drawing ..." + w);
    };

    d2.draw ();
}
}
