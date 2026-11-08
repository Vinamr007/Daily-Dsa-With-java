package DSA_BOOTCAMP.Searching;

public class BinarySearch {

    public static void BinarSearch(int[] a,int target){
        int st=0;
        int end=a.length-1;

        while(st<end){
            int mid=st+(end-st)/2;

            if(a[mid]==target){
                System.out.println(mid);
           return;
            } else if (target>mid) {
                st=mid;

            }else{
                end=mid;
            }


        }

    }
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8,9};
        int target=7;
BinarSearch(a,target);
    }
}
