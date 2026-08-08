package DSA_BOOTCAMP.Array.Day14;

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {

        int[] a={0,0,1,1,1,2,2,3,3,4};

        int index=1;

        for(int i=1;i<a.length;i++){

            if(a[i]!=a[i-1]){

                a[index]=a[i];

                index++;

            }
        }


        System.out.println("array after removing duplicates: ");

        for(int i=0;i<index;i++){
            System.out.print(a[i]+" ");
        }

        System.out.println("\nLength= "+ index);
    }


}
