package DSA_BOOTCAMP.Array.Day20;

import java.util.Scanner;

public class SubArraySumByK {

    public static void subarraySum(int[] nums, int k) {


        int maxsum=0;

        for(int i=0;i<nums.length-k;i++){
            int sum=0;
           for(int j=i;j<=k;j++){
               sum+=nums[j];
           }
            if(sum>maxsum){
                maxsum=sum;
            }
        }
        System.out.println(maxsum);

    }

    public static void main(String[] args) {
        int[] nums={2, 1, 5, 1, 3, 2};

                int k=3;
//        Scanner sc= new Scanner(System.in);
//        int k=sc.nextInt();

        SubArraySumByK.subarraySum(nums,k );

    }
}
