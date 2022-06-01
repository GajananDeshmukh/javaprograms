
public class Arrayexample{
    public static void main(String[] args) {
        int arr[]={3,4,5,6,7,8,9};
        int arr1[]={4,5,9,5,4,6,9};
       sum(arr,arr1);
        
    }
    public static void sum(int arr[],int arr1[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i]+arr1[i];
         //  System.out.println(" sum is " +sum);//each addition is take place
        }
            System.out.println(" sum is " +sum);// for total addition outside loop
    }
}


