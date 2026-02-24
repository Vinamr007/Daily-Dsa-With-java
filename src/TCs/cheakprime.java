package TCs;

import java.util.Scanner;

public class cheakprime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        boolean prime=true;
        if (num<=1){
            prime=true;
        }

        for(int i=2;i<Math.sqrt(num);i++){
            if(num%i==0){
                prime=false;
                break;
            }
        }

        System.out.println(prime ? "prime" : "not prime");
    }
}
