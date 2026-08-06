package Qspider;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int discount = sc.nextInt();
        System.out.println(price - (price * discount / 100));
    }
}
