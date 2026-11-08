package DSA_BOOTCAMP.Searching;

public class LiearSearch {
    public static  void binarySearch(int[] arr,int target){
        for(int i=0 ;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println(arr[i]);
                return;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr= {1,5,464,5,9,545,7,78,8        };
        int target=9;
        binarySearch(arr,target);

    }
}
