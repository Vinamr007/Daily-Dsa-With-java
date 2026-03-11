package TCs.NumberTheory;

import java.util.Scanner;

public class fabiconieserries {

    public static void main(String[] args) {
        int a=0,b=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        System.out.print(a+" ");
        System.out.print(b);
        for(int i=1;i<=n;i++){
            int c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}
