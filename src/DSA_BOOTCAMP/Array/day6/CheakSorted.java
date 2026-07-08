package DSA_BOOTCAMP.Array.day6;

public class CheakSorted {
    public static void main(String[] args) {
        int[] a={1,2,3,9,5};
int count=0;
        for(int i=0;i<a.length-1;i++){
            if(a[i]<a[i+1]){


            }else if(a[i]>a[i+1]){
                count++;
            }
        }
        if(count==0){
            System.out.println("Array is sorted ");
        }else {
            System.out.println("Array is not sorted ");
        }
    }
}
