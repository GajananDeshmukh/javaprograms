/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author student
 */
package demo.lambdaexpression;
import java.security.PKCS12Attribute;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
class Products{
    int id;
    String name;
    Float price; 
    int warrenty;
    
    public Products( int id, String name, Float price, int warrenty   ){
        this.id=id;
        this.name=name;
        this.price=price;
        this.warrenty=warrenty;
    }
}

public class lamndaexpressioncomparartor {
    public static void main(String[] args) {
         List<Products> list = new ArrayList<>();
         
         list.add(new Products(1, "dell laptop ", 50000f, 2));
         list.add(new Products(2, " nirma ", 80000f, 1));
         list.add(new Products(3, "santoor ", 70000f, 1));
         
         System.out.println("sorting on the basis of name...");
         //implementing lambda expression
         
         Collections.sort(list,(P1,p2)->{
             return P1.name.compareTo(p2.name);
         });
         for(Products p:list){
             System.out.println(p.id + " " + p.name + " " + p.price + " " + p.warrenty);
         
         }
         
    }
}
