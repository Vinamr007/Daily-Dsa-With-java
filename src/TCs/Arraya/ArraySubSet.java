package TCs.Arraya;

public class ArraySubSet {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int[] arr2={1,2,3,7};
        boolean found = false;
       for(int i=0;i<arr2.length;i++){
            found=false;
           for(int j=0;j<arr1.length;j++){
               if(arr1[j]==arr2[i]){
                   found=true;
                     break;
               }
           }
       }
       if(found){
           System.out.println("arr2 is subset of arr1");
       }
       else{
           System.out.println("arr2 is not subset of arr1");
       }
    }
}
