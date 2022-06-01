package demo.dateandtimeandcalender;

import java.text.DateFormat;
import java.util.Date;

public class Dateinternaltionalizationdemo {

    public static void main(String[] args) {
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT);
        System.out.println(dateFormat.format(new Date()));

        dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println(dateFormat.format(new Date()));

        dateFormat = DateFormat.getDateInstance(DateFormat.MEDIUM);
        System.out.println(dateFormat.format(new Date()));

        dateFormat = DateFormat.getDateInstance(DateFormat.LONG);
        System.out.println(dateFormat.format(new Date()));

        dateFormat = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println(dateFormat.format(new Date()));

    }
}
