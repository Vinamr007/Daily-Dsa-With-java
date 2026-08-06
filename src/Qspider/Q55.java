package Qspider;

import java.util.Scanner;

public class Q55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d1 = sc.nextInt();
        int d2 = sc.nextInt();
        int d3 = sc.nextInt();
        int mileage = sc.nextInt();
        System.out.println((d1 + d2 + d3) / mileage);
    }
}
