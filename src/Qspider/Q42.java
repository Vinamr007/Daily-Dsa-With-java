package Qspider;

import java.util.Scanner;

public class Q42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sellingPrice = sc.nextInt();
        int profit = sc.nextInt();
        System.out.println(sellingPrice * 100 / (100 + profit));
    }
}
