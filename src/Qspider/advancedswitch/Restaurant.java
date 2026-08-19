package Qspider.advancedswitch;

import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Burger\n2. Sandwich\n3. Pizza");
        int item = sc.nextInt();

        System.out.print("Quantity: ");
        int qty = sc.nextInt();

        if (qty <= 0) {
            System.out.println("Invalid quantity");
            return;
        }

        int price;
        switch (item) {
            case 1:
                price = 100;
                break;
            case 2:
                price = 150;
                break;
            case 3:
                price = 200;
                break;
            default:
                System.out.println("Invalid item");
                return;
        }

        System.out.println("Total = ₹" + (price * qty));
    }
}

