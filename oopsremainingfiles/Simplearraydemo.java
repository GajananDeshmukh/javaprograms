
public class Simplearraydemo {
    public static void main(String[] args) {
        int arr[];//array decleration
         arr=new int[5];// array intialization
         
         arr[0]=10;//assign value of array
         arr[1]=20;
         arr[2]=30;
         arr[3]=40;
         arr[4]=50;
         
         for(int i=0;i<arr.length;i++){
         System.out.println("The element at index " +i + " value assign of array is " + arr[i]);
    }
}
}
