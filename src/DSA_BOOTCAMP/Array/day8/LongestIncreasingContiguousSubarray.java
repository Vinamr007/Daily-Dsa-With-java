package DSA_BOOTCAMP.Array.day8;

public class LongestIncreasingContiguousSubarray {
    public static void main(String[] args) {
        int[] a={1,2,3,2,3,4,5};

        int count=0;
        int max=0;
        for(int i=0;i<a.length-1;i++){
            if(a[i]>a[i+1]){
                count++;
                if(count>max){
                    max=count;
                }
            }else{
                count=0;
            }
        }

        System.out.println("max length of increasing contiguous subarray is: "+max);
    }

}
