package Searching;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums={2, 7, 11, 15};
        int target=9;

        for(int i=0;i< nums.length;i++){
            for(int j=0;j< nums.length;j++){
                if(nums[i]+nums[j]==target){
                    System.out.println("Indices: [" + i + ", " + j + "]");
                    return;
                }
            }
        }
    }
}
