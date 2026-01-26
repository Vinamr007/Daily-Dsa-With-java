package practice.searchh;

public class twosum {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 9;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    System.out.println("Index are: "+i+" and "+j);
                }
            }
        }
    }
}
