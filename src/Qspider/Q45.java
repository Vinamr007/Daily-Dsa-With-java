package Qspider;

import java.util.Scanner;

public class Q45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalLitres = sc.nextInt();
        int juicePercent = sc.nextInt();
        int addedPureJuice = sc.nextInt();
        int juice = totalLitres * juicePercent / 100 + addedPureJuice;
        int newTotal = totalLitres + addedPureJuice;
        System.out.println(juice * 100 / newTotal);
    }
}
