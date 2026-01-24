package practice;

import java.util.Scanner;

public class RotatedByKPlace {
    public static void reverse(int[] nums,int st,int end){
        while(st<end){
            int temp=nums[st];
            nums[st]=nums[end];
            nums[end]=temp;
            st++;
            end--;
        }
    }
    public static void krotate(int[] nums,int k){
        k=k%nums.length;
        reverse(nums,0, nums.length-1);
        reverse(nums,k-1,0);
        reverse(nums,k+1,nums.length-1);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter k ");
        int k=sc.nextInt();
        int[] nums={1,2,3,4,5,6,7};
        krotate(nums,k);
    }
}
