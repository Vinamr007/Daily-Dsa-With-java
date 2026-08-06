package Qspider;

import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int distance = sc.nextInt();
        int mileage = sc.nextInt();
        int extra = sc.nextInt();
        System.out.println(distance / mileage + extra);
    }
}
