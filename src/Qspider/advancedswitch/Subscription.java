package Qspider.advancedswitch;

import java.util.Scanner;

public class Subscription {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int currentPlan = 1; // basic

        System.out.println("Upgrade to:\n2. Standard\n3. Premium");
        int newPlan = sc.nextInt();

        switch (newPlan) {
            case 2:
                if (currentPlan < 2) {
                    System.out.println("Upgraded to Standard");
                } else {
                    System.out.println("Upgrade Not Allowed");
                }
                break;
            case 3:
                if (currentPlan < 3) {
                    System.out.println("Upgraded to Premium");
                } else {
                    System.out.println("Upgrade Not Allowed");
                }
                break;
            default:
                System.out.println("Invalid");
        }
    }
}

