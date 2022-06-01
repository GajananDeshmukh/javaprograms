package demo.dateandtimeandcalender;

import java.util.*;

public class Calenderdemo {

    public static void main(String[] args) {
        Date date = new Date(99999999L);
        System.out.println("Date is " + date);

        Calendar call = Calendar.getInstance();
        Calendar call2 = Calendar.getInstance();
        call.setTime(date);

        System.out.println("our calender one month is " + call.get(Calendar.MONTH));
        System.out.println("our calender one year is is " + call.get(Calendar.YEAR));
        System.out.println("our calender(call2) one month is " + call2.get(Calendar.MONTH));
        System.out.println("our calender one(call2) year is is " + call2.get(Calendar.YEAR));
        
        call.add(Calendar.MONTH, 15);
        date=call.getTime();
        System.out.println("our date is " + date);
        
        call.roll(Calendar.MONTH, -15);
        date=call2.getTime();
        System.out.println("our date is " + date);
    }
}
