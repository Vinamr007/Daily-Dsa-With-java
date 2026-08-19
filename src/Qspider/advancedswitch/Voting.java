package Qspider.advancedswitch;

import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Citizen\n2. Foreigner");
        int type = sc.nextInt();

        int age = sc.nextInt();

        switch (type) {
            case 1:
                System.out.println(age >= 18 ? "Eligible" : "Not Eligible");
                break;
            case 2:
                System.out.println("Not Allowed");
                break;
            default:
                System.out.println("Invalid category");
        }
    }
}

