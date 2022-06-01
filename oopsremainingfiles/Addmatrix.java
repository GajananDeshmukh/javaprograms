
public class Addmatrix {
    public static void main(String[] args) {
        int arr1[][]={{2,7,9},{4,8,9},{10,23,5}};
        int arr2[][]={{1,2,3},{4,5,6},{7,8,9}};
        int addition[][]=new int[3][3];
        int substract[][]=new int[3][3];
        for(int i=0;i<3;i++){
              for(int j=0;j<3;j++){
                  addition[i][j]=arr1[i][j] + arr2[i][j];
                  
              }
             
        }
        System.out.println(" addition of matrix ");
         for(int i=0;i<3;i++){
              for(int j=0;j<3;j++){
                  System.out.print(addition[i][j]+ " ");
              }
              System.out.println();
    }
      for(int i=0;i<3;i++){
              for(int j=0;j<3;j++){
                  substract[i][j]=arr1[i][j] - arr2[i][j];
                  
              }   
      }
        System.out.println(" substraction of metrix ");
             for(int i=0;i<3;i++){
              for(int j=0;j<3;j++){
                  System.out.print(substract[i][j]+ " ");
              }
              System.out.println();
    }
    }
}


