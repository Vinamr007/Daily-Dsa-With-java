package Qspider.advancedswitch;

import java.util.Scanner;

public class BusFare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int km = sc.nextInt();
        if (km < 0) {
            System.out.println("Invalid distance");
            return;
        }

        int fare;
        switch (km / 10) {
            case 0:
                fare = 10;
                break;
            case 1:
                fare = 20;
                break;
            case 2:
                fare = 30;
                break;
            default:
                fare = 50;
        }

        System.out.println("Fare = " + fare);
    }
}

