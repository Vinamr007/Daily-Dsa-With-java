package Searching;

public class BinarySearch {
    public void search(int[] nums,int target){
        int start=0;
        int end=nums.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                System.out.println(mid);
                break;

            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        ;
    }
    public static void main(String[] args) {
        int[] nums={-10, -5, 0, 3, 7, 9, 12};
        int target=0;
BinarySearch bs=new BinarySearch();
bs.search(nums,target);


    }
}
