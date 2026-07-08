package DSA_BOOTCAMP.Array.day8;

import java.util.Scanner;

public class leftrotate {

        public static void reverse(int[] a,int st,int end){
            while(st<end){
                int temp=a[st];
                a[st]=a[end];
                a[end]=temp;
                st++;
                end--;
            }
        }

        public static void leftrotate(int[] a,int k){
            k=k%a.length;
            reverse(a, 0, k - 1);
            reverse(a, k, a.length - 1);
            reverse(a, 0, a.length - 1);



            for(int i=0;i<a.length;i++){
                System.out.print(a[i]+" ");
            }
        }

    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter k");
        int k=sc.nextInt();
        leftrotate(a,k);
    }
}
