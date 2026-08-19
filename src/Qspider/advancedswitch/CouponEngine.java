package Qspider.advancedswitch;

import java.util.Scanner;

public class CouponEngine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter coupon: ");
        String coupon = sc.next();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        double discount = 0;

        switch (coupon) {
            case "SAVE10":
                discount = 10;
                break;
            case "SAVE20":
                if (amount > 2000) {
                    discount = 20;
                }
                break;
            case "FLAT500":
                if (amount > 5000) {
                    discount = 500;
                }
                break;
            default:
                System.out.println("Invalid coupon");
                return;
        }

        double finalPrice = (discount < 100)
                ? amount - (amount * discount / 100)
                : amount - discount;

        System.out.println("Final Price: " + finalPrice);
    }
}

