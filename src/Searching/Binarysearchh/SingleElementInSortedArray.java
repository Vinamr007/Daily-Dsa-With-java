package Searching.Binarysearchh;

public class SingleElementInSortedArray {
    public static void main(String[] args) {
        int[] nums={1,1,2,3,3,4,4,8,8};

int st=0,end=nums.length-1;
while(st<end){
    int mid=st+(end-st)/2;
    if(nums[mid]!=nums[mid+1] && nums[mid]!=nums[mid-1]){
        System.out.println(nums[mid]);
        break;
    }else if(nums[mid]!=nums[mid+1]){
        end=mid+1;
    }
    else{
        st=mid+1;
    }
  //  System.out.println(nums[mid]);
}

    }
}
