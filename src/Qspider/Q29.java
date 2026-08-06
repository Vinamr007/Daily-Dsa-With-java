package Qspider;

import java.util.Scanner;

public class Q29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        int rate = sc.nextInt();
        amount = amount * (100 + rate) / 100;
        amount = amount * (100 + rate) / 100;
        amount = amount * (100 + rate) / 100;
        System.out.println(amount);
    }
}
