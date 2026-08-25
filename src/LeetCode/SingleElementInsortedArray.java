package LeetCode;

public class SingleElementInsortedArray {
    public static int singleNonDuplicate(int[] nums) {
        int result=0;
        for(int i=0;i<nums.length;i++){
            result = result ^ nums[i];

        }

        return result;
    }

    public static void main(String[] args) {
        singleNonDuplicate(new int[]{1,2,3,4,5,6,7,8,9});
    }
}
