package Qspider.DEcisionMkingg;

import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int finalPrice = sc.nextInt();
        int discount = sc.nextInt();
        System.out.println(finalPrice * 100 / (100 - discount));
    }
}
