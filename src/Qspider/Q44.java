package Qspider;

import java.util.Scanner;

public class Q44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fuelCost = sc.nextInt();
        int pricePerLitre = sc.nextInt();
        int mileage = sc.nextInt();
        System.out.println((fuelCost / pricePerLitre) * mileage);
    }
}
