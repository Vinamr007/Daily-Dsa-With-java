package Qspider.advancedswitch;

import java.util.Scanner;

public class LoanApproval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Home\n2. Car");
        int type = sc.nextInt();

        System.out.print("Salary: ");
        int salary = sc.nextInt();

        System.out.print("Credit Score: ");
        int score = sc.nextInt();

        switch (type) {
            case 1:
                if (salary > 50000 && score > 700) {
                    System.out.println("Home Loan Approved");
                } else {
                    System.out.println("Rejected");
                }
                break;
            case 2:
                if (salary > 30000 && score > 650) {
                    System.out.println("Car Loan Approved");
                } else {
                    System.out.println("Rejected");
                }
                break;
            default:
                System.out.println("Invalid type");
        }
    }
}

