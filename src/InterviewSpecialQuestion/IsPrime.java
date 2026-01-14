package InterviewSpecialQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
//boolean isprime[]=seiveOfEratosthenes(20);
//for(int i=0;i<20;i++){
//    if(isprime[i]==true){
//    System.out.println(i+" "+isprime[i]);
//}}
//    }
//    static boolean[] seiveOfEratosthenes(int n){
//        boolean[] isprime=new boolean[n+1];
//        Arrays.fill(isprime,true);
//        isprime[0]=false;
//        isprime[1]=false;
//        for(int i=2;i*i<=n;i++){
//            if(isprime[i]){
//                for(int j=i*i;j<=n;j+=i){
//                    isprime[j]=false;
//                }
//            }
//        }
//
//        return isprime;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check if it is prime:");
        int number=sc.nextInt();
        int count=0;
        for(int i=2;i<number;i++){
            if(number%i==0){
                count++;
                break;
            }
        }
        if(count==0){
            System.out.println(number+" is a prime number.");
        }else {
            System.out.println(number + " is not a prime number.");
        }

    }

}
