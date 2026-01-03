package Array;

public class searchInRotatedSortARrayByBoolean {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 3;
        boolean found = false;
        for(int i=0;i<nums.length;i++){
         if(nums[i]==target){
             found = true;
             break;
         }
        }
        System.out.println(found);
    }
}
