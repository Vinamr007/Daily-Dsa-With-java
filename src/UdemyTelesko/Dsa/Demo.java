package UdemyTelesko.Dsa;

import Searching.BinarySearch;

public class Demo {
    public static void main(String[] args) {
        int[] nums = {5, 7, 9, 11,13,15 };
int target=11;

int result = linearSearch(nums, target);
        if(result != -1)
            System.out.println(result);
        else
            System.out.println("element not found");
int result1= binarySearch(nums,target);
        if(result1 != -1)
            System.out.println(result1);
        else
            System.out.println("element not found");



    }
// linear search
    public static int linearSearch(int[] nums, int target) {
    for(int i=0;i<nums.length;i++) {
            if(nums[i]==target)
                    return i;
            }

        return -1;
    }

    // binary Search

    public static int binarySearch(int[] nums, int target){

        int start = 0;
        int end = nums.length-1;

        while(start<=end){
            int mid=(start+end)/2;

            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }


        return -1;
    }

}