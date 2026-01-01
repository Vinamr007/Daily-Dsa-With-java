package Searching;

public class FirstLastPositionInArray {
    private int findfirst(int[] nums,int target){
        int index=-1;
        int st=0;
        int end=nums.length-1;
        while(st<=end){
            int  mid=st+(end-st)/2;
            if(nums[mid]>=target){
                end=mid-1;
            }else{
                st=mid+1;
            }
            if(nums[mid]==target) index=mid;
        }
        return index;
    }
    private int findlast(int[] nums,int target){
        int index=-1;
        int st=0;
        int end=nums.length-1;
        while(st<=end){
            int  mid=st+(end-st)/2;
            if(nums[mid]<=target){
                st=mid+1;
            }else{
                end=mid-1;
            }
            if(nums[mid]==target) index=mid;
        }
        return index;
    }

    public static void main(String[] args) {
       int[] nums = {5,7,7,8,8,10};
       int target =7;
int[] result ={-1,-1};
FirstLastPositionInArray ab=new FirstLastPositionInArray();
result[0]=ab.findfirst(nums,target);

result[1]=ab.findlast(nums,target);

    }

}
