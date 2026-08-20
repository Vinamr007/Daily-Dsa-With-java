package Qspider.DEcisionMkingg;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double distance = sc.nextDouble();
        double mileage = sc.nextDouble();
        double price = sc.nextDouble();
        System.out.println((distance / mileage) * price);
    }
}
