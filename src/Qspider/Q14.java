package Qspider;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        int rate = sc.nextInt();
        long finalAmount = amount;
        finalAmount = finalAmount * (100 + rate) / 100;
        finalAmount = finalAmount * (100 + rate) / 100;
        System.out.println(finalAmount);
    }
}
