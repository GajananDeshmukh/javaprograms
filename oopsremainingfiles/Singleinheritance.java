class Bicycle{
        int gear;
        int speed;
        
        public Bicycle(int gear, int speed){
               this.gear=gear;
               this.speed=speed;
        }
         public void applybrake(int decrement){
                speed=speed-decrement;
         }
         public void speedup(int increment){
                speed=speed+increment;
         }
         public String toString(){
                return(" no of gear is "+ gear + " speed of bicycle is " +speed);
         }
         }
class Mountainbike extends Bicycle{
    int seatheight;

public Mountainbike(int gear,int speed, int seatheight){
    super(gear, speed);
    this.seatheight=seatheight;
}
public void seatheight(int newValue){
        seatheight=newValue;
}
@Override public String toString(){
        return (super.toString() + " seat height is " +seatheight );
}
        
}
public class Singleinheritance {
    public static void main(String[] args) {
        Bicycle b=new Bicycle(3, 45);
        b.applybrake(20);
        b.speedup(25);
      Mountainbike mb=new Mountainbike(4, 60, 5);
        System.out.println(b.toString());
      System.out.println(mb.toString());
      
    }
    
}
