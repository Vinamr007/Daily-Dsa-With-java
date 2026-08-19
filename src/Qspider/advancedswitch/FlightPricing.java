package Qspider.advancedswitch;

import java.util.Scanner;

public class FlightPricing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Economy\n2. Business\n3. First");
        int cls = sc.nextInt();

        System.out.print("Enter distance: ");
        int dist = sc.nextInt();

        System.out.print("Season (1-Peak, 2-Off): ");
        int season = sc.nextInt();

        if (dist <= 0) {
            System.out.println("Invalid distance");
            return;
        }

        double rate;
        switch (cls) {
            case 1:
                rate = 5;
                break;
            case 2:
                rate = 10;
                break;
            case 3:
                rate = 20;
                break;
            default:
                System.out.println("Invalid class");
                return;
        }

        double fare = dist * rate;
        if (season == 1) {
            fare *= 1.5;
        } else if (season != 2) {
            System.out.println("Invalid season");
            return;
        }

        System.out.println("Fare = " + fare);
    }
}

