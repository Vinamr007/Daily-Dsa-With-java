package DSA_BOOTCAMP.Array.day6;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int n1=n;
int st=0, sum=0, rem=0,rev=0;
while(n>0){
    rem=n%10;
    rev=rev*10+rem;
    n=n/10;
}
if(rev==n1){
    System.out.println("the number is palindrome");
}else {
    System.out.println("the number is not palindrome");
}




    }
}
