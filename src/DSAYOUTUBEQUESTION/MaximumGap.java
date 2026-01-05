package DSAYOUTUBEQUESTION;

import java.util.Arrays;

public class MaximumGap {
    public int maximumGap(int[] nums) {
    Arrays.sort(nums);
    int difference=0;
    // int summ;
    for(int i=0;i<nums.length-1;i++){
        if(nums.length < 2){
            return 0;

        }
        int summ=nums[i+1]-nums[i];
        if(summ>difference){
            difference=summ;
        }
    }
    return difference;
    //return -1;
}

    public static void main(String[] args) {
        int[] nums={3,6,9,1};
        MaximumGap m=new MaximumGap();
        int result=m.maximumGap(nums);
        System.out.println(result);
    }
}
