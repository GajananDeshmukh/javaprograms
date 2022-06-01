interface Showable{
    void show();
    interface Message{
        interface Message1{
            void msg();
        }
    }
}
class Displayshow implements Showable{
    public void show(){
        System.out.println(" print show method ");
    }
}
public class Nestedinterface implements Showable.Message.Message1{
    public void msg(){
        System.out.println(" hello nested interface");
    }
    public static void main(String[] args) {
    Showable.Message.Message1 message=new Nestedinterface();
    message.msg();
    
   
   Displayshow display=new Displayshow();
   display.show();
   
    }
  
    
  
   
   
    
}
