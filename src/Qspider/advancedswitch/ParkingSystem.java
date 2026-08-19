package Qspider.advancedswitch;

import java.util.Scanner;

public class ParkingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Bike\n2. Car");
        int type = sc.nextInt();

        System.out.print("Hours: ");
        int hrs = sc.nextInt();

        if (hrs <= 0) {
            System.out.println("Invalid hours");
            return;
        }

        int rate;
        switch (type) {
            case 1:
                rate = 10;
                break;
            case 2:
                rate = 20;
                break;
            default:
                System.out.println("Invalid vehicle type");
                return;
        }

        int fee = hrs * rate;
        if (hrs > 5) {
            fee += 50;
        }

        System.out.println("Fee = " + fee);
    }
}

