package Qspider.advancedswitch;

import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Standard\n2. Deluxe\n3. Suite");
        int room = sc.nextInt();

        int price;
        switch (room) {
            case 1:
                price = 1000;
                break;
            case 2:
                price = 2000;
                break;
            case 3:
                price = 5000;
                break;
            default:
                System.out.println("Invalid room type");
                return;
        }

        System.out.println("Price = ₹" + price);
    }
}

