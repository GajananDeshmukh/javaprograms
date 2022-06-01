
package demo.loops;
public class Labelsinjava {
  void demo(){
      first : //label
      for(int i=0;i<3;i++){
          for(int j=0;j<3;j++){ //first execute j=0 then j<3 if true then execute below that lastky j++
             if (i==1){
              continue first;
              
          }
              System.out.println(" [i= " +i +", j= " +j + "] ");
          }
      }
      System.out.println();
      
      second :
      for(int i=0;i<3;i++){
          for(int j=0;j<3;j++){
           if (i==1){
              break second;
              
          }
            System.out.println(" [i= " +i +", j= " +j + "] ");
  }
          
      }
}
}
  