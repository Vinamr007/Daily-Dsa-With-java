package Qspider;

import java.util.Scanner;

public class Q40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int discount1 = sc.nextInt();
        int discount2 = sc.nextInt();
        price = price * (100 - discount1) / 100;
        price = price * (100 - discount2) / 100;
        System.out.println(price);
    }
}
