package TCs.NumberTheory;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Squareroot {
    public static int squareroot(int n){
        for(int i=1;i<n/2;i++){
            if(i*i==n){
                System.out.println(i);
            }
        }
        System.out.println("-1");
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        squareroot(n);


    }
}

