package DSA_BOOTCAMP.TwoPointer;

public class TwoPointers {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 8, 9};
        int target = 10;


        int left =0;
        int right=arr.length-1;


        while(left< right){

            int sum=arr[left]+arr[right];

            if(sum==target){
                System.out.println(arr[left]+" "+arr[right]+" "+target );
                break;
            }
            else if(sum< target){
                left++;
            }else{
                right--;
            }
        }
    }
}
