
package demo.Enum;

import java.time.MonthDay;

public class Enumconsvaluedemo {
    public enum Weekday{Monday(5), Tuesday(10), Wednesday(15);
    private int y;
    private Weekday(int y){
        this.y=y;
    }
    }
    
    public static void main(String[] args) {
        for(Weekday w:Weekday.values()){
            System.out.println(w + " " + w.y);
        }
    }
}
