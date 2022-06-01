package demo.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Trycatchdemo {

    void display() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println(" enter the value1");
            int var1 = sc.nextInt();
            System.out.println(" enter the value2");
            int var2 = sc.nextInt();
            try {
                int var3 = var1 + var2;
                System.out.println(var3);

                var2 = var2 / var1;
                System.out.println(var2);
            } catch (ArithmeticException e) {
                System.out.println(" Arithematic expression occured whic is divided by zero ");
            }
        } catch (InputMismatchException e) {
            System.out.println("dont enter variable value please enter int type of value ");
        }

        System.out.println(" hello ");
        System.out.println(" Fuel ");

    }
}
