
public class Arrayclonedemo {
    public static void main(String[] args) {
        int intarray[]={1,2,3,4,5};
        int clonearray[]=intarray.clone();
        
          for(int i=0;i<intarray.length;i++){
        System.out.println(intarray[i] + " ");
          }
        System.out.println(intarray[0]==clonearray[0]); //shallow copy
        System.out.println(intarray==clonearray);//deep copy
        System.out.println(intarray==intarray); 
        System.out.println(clonearray==clonearray);
        
         for(int i=0;i<clonearray.length;i++){
             System.out.println(clonearray[i] + " ");
         }
        
    }
  
}
