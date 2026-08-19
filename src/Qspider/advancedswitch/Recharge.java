package Qspider.advancedswitch;

import java.util.Scanner;

public class Recharge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance = 500;

        System.out.println("1. ₹199\n2. ₹299\n3. ₹399");
        int plan = sc.nextInt();

        int cost;
        switch (plan) {
            case 1:
                cost = 199;
                break;
            case 2:
                cost = 299;
                break;
            case 3:
                cost = 399;
                break;
            default:
                System.out.println("Invalid plan");
                return;
        }

        if (balance >= cost) {
            System.out.println("Recharge Successful");
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}

