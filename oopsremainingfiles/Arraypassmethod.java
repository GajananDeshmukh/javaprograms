
public class Arraypassmethod {
    public static void main(String[] args) {
        int arr[]={3,4,5,6,7,8,9};
       sum(arr);
        
    }
    public static void sum(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
           System.out.println(" sum is " +sum);//each addition is take place
        }
            System.out.println(" sum is " +sum);// for total addition outside loop
    }
}
