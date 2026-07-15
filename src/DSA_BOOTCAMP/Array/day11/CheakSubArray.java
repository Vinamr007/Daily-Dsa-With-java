package DSA_BOOTCAMP.Array.day11;

public class CheakSubArray {
    public static void main(String[] args) {
         int[] a={11,1,13,21,3,7};
         int[] a2={11,3,7};

         boolean issubset=true;
         for(int i=0;i<a2.length;i++){
             boolean found=false;

             for(int j=0;j<a.length;j++){
                 if(a2[i]==a[j]){
                     found=true;
                     break;
                 }
             }
             if(!found){
                 issubset=false;
                 break;
             }
         }
if(issubset){
    System.out.println("subset");
}else{
    System.out.println("not subset");
}



    }
}
