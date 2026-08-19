package Qspider.advancedswitch;

import java.util.Scanner;

public class FileAccess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String role = sc.next();

        switch (role) {
            case "admin":
                System.out.println("Read Write Delete");
                break;
            case "user":
                System.out.println("Read Write");
                break;
            case "guest":
                System.out.println("Read Only");
                break;
            default:
                System.out.println("No Access");
        }
    }
}

