package Qspider;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int distance = sc.nextInt();
        int mileage = sc.nextInt();
        int price = sc.nextInt();
        int toll = sc.nextInt();
        System.out.println((distance / mileage) * price + toll);
    }
}
