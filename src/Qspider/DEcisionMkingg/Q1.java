package Qspider.DEcisionMkingg;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = sc.nextInt();
        int deposit = sc.nextInt();
        int withdraw = sc.nextInt();
        System.out.println(balance + deposit - withdraw);
    }
}
