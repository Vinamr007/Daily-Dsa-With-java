package Qspider.DEcisionMkingg;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int costPrice = sc.nextInt();
        int sellingPrice = sc.nextInt();
        int profit = sellingPrice - costPrice;
        System.out.println(profit * 100 / costPrice);
    }
}
