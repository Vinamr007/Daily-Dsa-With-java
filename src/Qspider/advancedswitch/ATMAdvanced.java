package Qspider.advancedswitch;

import java.util.Scanner;

public class ATMAdvanced {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int correctPin = 1234;
        int balance = 5000;

        System.out.print("Enter PIN: ");
        int pin = sc.nextInt();

        if (pin != correctPin) {
            System.out.println("Invalid PIN");
            return;
        }

        System.out.println("1. Check Balance\n2. Withdraw\n3. Deposit");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Balance: " + balance);
                break;
            case 2:
                System.out.print("Enter amount: ");
                int amt = sc.nextInt();
                if (amt <= 0) {
                    System.out.println("Invalid Amount");
                } else if (amt <= balance) {
                    balance -= amt;
                    System.out.println("Transaction Successful");
                } else {
                    System.out.println("Insufficient Balance");
                }
                break;
            case 3:
                System.out.print("Enter deposit: ");
                int deposit = sc.nextInt();
                if (deposit <= 0) {
                    System.out.println("Invalid Amount");
                } else {
                    balance += deposit;
                    System.out.println("Deposit Successful");
                }
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
