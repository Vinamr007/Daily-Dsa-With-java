package Qspider.DEcisionMkingg;

import java.util.Scanner;

public class Q32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int daysA = sc.nextInt();
        int daysB = sc.nextInt();
        double result = (double) daysA * daysB / (daysA + daysB);
        System.out.printf("%.10f%n", result);
    }
}
