package Qspider.advancedswitch;

import java.util.Scanner;

public class CabSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int km = sc.nextInt();
        int time = sc.nextInt(); // 1-peak, 2-normal

        if (km <= 0) {
            System.out.println("Invalid distance");
            return;
        }

        int fare = km * 10;

        switch (time) {
            case 1:
                fare *= 2;
                break;
            case 2:
                break;
            default:
                System.out.println("Invalid time type");
                return;
        }

        System.out.println("Fare = " + fare);
    }
}

