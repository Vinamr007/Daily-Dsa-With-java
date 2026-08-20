package Qspider.DEcisionMkingg;

import java.util.Scanner;

public class Q33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kg1 = sc.nextInt();
        int price1 = sc.nextInt();
        int kg2 = sc.nextInt();
        int price2 = sc.nextInt();
        System.out.println((kg1 * price1 + kg2 * price2) / (kg1 + kg2));
    }
}
