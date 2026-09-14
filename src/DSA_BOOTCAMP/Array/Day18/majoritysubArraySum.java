package DSA_BOOTCAMP.Array.Day18;

import java.util.Scanner;

public class majoritysubArraySum {
    public static void main(String[] args) {

        int[] a={2, 7, 6, 1, 4, 5};

        Scanner sc= new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();

        int sum;
        int maxlength=0;

        for(int i=0;i<a.length;i++){
sum=0;
           // int divide=0;
            for(int j=i;j<a.length;j++){
                sum+=a[j];

                if(sum%n==0){
                    int length=j-i+1;
                    if(length>maxlength){
                        maxlength=length;
                    }
                }
            }

        }
        System.out.println(maxlength);
    }
}
