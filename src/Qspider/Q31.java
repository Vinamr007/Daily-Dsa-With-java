package Qspider;

import java.util.Scanner;

public class Q31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int litres1 = sc.nextInt();
        int concentration1 = sc.nextInt();
        int litres2 = sc.nextInt();
        int concentration2 = sc.nextInt();
        System.out.println((litres1 * concentration1 + litres2 * concentration2) / (litres1 + litres2));
    }
}
