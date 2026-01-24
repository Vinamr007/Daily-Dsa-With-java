package practice;

public class singleelementinsortedarrayys {
    public static void main(String[] args) {
        int[] nums={1,1,2,3,3,4,4,8,8};
int start=0,end=nums.length-1;

while(start<end){
    int mid=start+(end-start)/2;
    if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]){
        System.out.println(nums[mid]+" "+"at the index of "+mid);
        break;
    }
    else if(nums[mid]!=nums[mid+1]){
        end=mid+1;
    }else{
        start=mid+1;
    }



}

    }
}
