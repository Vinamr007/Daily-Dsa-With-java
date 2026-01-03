package Array;

public class SearchinRotatedSortArray {
    public static void  main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        for(int i=0;i<nums.length;i++){
         if(nums[i]==target){
             System.out.println(i);
         }
        }


    }
}
