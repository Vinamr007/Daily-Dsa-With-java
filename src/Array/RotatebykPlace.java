package Array;

import java.util.Scanner;

public class RotatebykPlace {
    public void reverse(int[] nums,int start,int end){

        while (start < end) {

            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start ++;
            end--;
        }
    }
    public void rotate(int[] nums,int k){
         k%=nums.length;
        reverse(nums,0, nums.length-1);
        reverse(nums,k-1,0);
        reverse(nums,k, nums.length-1);

        for(int i=0;i< nums.length;i++){
            System.out.print(nums[i]);
        }
    }
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        System.out.println("enter k ");
int k=sc.nextInt();
int[] nums={1,2,3,4,5,6,7};
RotatebykPlace r=new RotatebykPlace();
r.rotate(nums,k);


    }
}
