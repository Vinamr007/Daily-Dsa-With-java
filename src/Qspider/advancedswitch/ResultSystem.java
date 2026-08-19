package Qspider.advancedswitch;

import java.util.Scanner;

public class ResultSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Theory\n2. Practical");
        int type = sc.nextInt();

        System.out.print("Marks: ");
        int m = sc.nextInt();

        if (m < 0 || m > 100) {
            System.out.println("Invalid marks");
            return;
        }

        switch (type) {
            case 1:
                if (m >= 75) {
                    System.out.println("Distinction");
                } else if (m >= 50) {
                    System.out.println("Pass");
                } else {
                    System.out.println("Fail");
                }
                break;
            case 2:
                System.out.println(m >= 60 ? "Pass" : "Fail");
                break;
            default:
                System.out.println("Invalid type");
        }
    }
}

