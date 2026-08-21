package Qspider.DEcisionMkingg;

import java.util.Scanner;

public class Q50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int costPrice = sc.nextInt();
        int loss = sc.nextInt();
        System.out.println(costPrice * (100 - loss) / 100);
    }
}
