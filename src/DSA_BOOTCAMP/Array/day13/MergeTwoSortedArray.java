package DSA_BOOTCAMP.Array.day13;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
       int[] arr1 = {1,3,5};
       int[] arr2 = {2,4,6};

       int count=arr1.length+arr2.length;

       int[] merg=new int[count];


       int i=0;
       int j=0;
       int k=0;

       while(i< arr1.length && j<arr2.length){
           if(arr1[i]<arr2[j]){
               merg[k]=arr1[i];
               i++;
           }else{
               merg[k]=arr2[j];
               j++;
           }
           k++;
       }

       while(i< arr1.length){
           merg[k]=arr1[i];
           i++;
           k++;
       }

       while(j< arr2.length){
           merg[k]=arr2[j];
           j++;
           k++;
       }

for(int l=0;l<merg.length;l++){
    System.out.print(merg[l]+" ");
}
    }
}
