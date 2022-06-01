package demo.numberformat;

import java.text.*;
import java.util.*;
import java.util.concurrent.atomic.DoubleAdder;

public class Currencydemo {

    static void printcurrency(Locale locale) {
        double d = 25.13;
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
        String currency = numberFormat.format(d);
        System.out.println(currency + " for the local " + locale);

    }

    static void printcurrency1() {
        double d = 12.35;
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
        String currency = nf.format(d);
        System.out.println(currency);
    }

    public Currencydemo() {
    }

    public static void main(String[] args) {
        printcurrency(Locale.ITALY);
        printcurrency(Locale.GERMANY);
        printcurrency(Locale.UK);
        printcurrency(Locale.US);
        printcurrency1();
    }
}
