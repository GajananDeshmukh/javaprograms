package demo.dateandtimeandcalender;

import java.util.*;

public class Datedemo {

    public static void main(String[] args) {
        Date date1 = new Date();//to get system date 
        Date date2 = new Date(9999999999L);
        Date date3 = new Date(9999999999999L);

        System.out.println("Our first date is " + date1);
        System.out.println("Our second date is " + date2);
        System.out.println("Our third date is " + date3);
        
        if(date1.after(date2)){
            System.out.println("Our first date is after two");
        }
        if(date2.before(date3)){
            System.out.println("our second date is before third date ");
        }
        date2.setTime(date2.getTime() + 9999999999999999L);
        System.out.println("Our updated second new date is :" + date2);
        
        if(date2.before(date3)){
            System.out.println("our second date is print before date 3");
        }
        else{
            System.out.println("Our second date is after our third date");
        }
    }
}
