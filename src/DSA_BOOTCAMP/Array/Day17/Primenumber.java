package DSA_BOOTCAMP.Array.Day17;

import java.util.Scanner;

public class Primenumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
boolean isprime=true;

for(int i=2;i<=n;i++){
    if(n%i==0){
        isprime=false;
        break;
    }
}
if(isprime){
    System.out.println(" Prime number");
}else{
    System.out.println("not  Prime number");
}

    }
}
