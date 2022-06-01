
package demo.loops;
public class Enhancedforloopdemo {
void enhanceforloop(){
    String arr[]={"gaju","jojo","manthan"};
     
    // enhance for loop
      System.out.println("for enhance loop");
    for(String x:arr){
        System.out.println(x);
    }
    //normal for loop
    System.out.println("for simple loop");
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }

}    
}
