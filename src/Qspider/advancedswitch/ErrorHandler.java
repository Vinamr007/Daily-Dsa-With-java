package Qspider.advancedswitch;

import java.util.Scanner;

public class ErrorHandler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int code = sc.nextInt();

        switch (code) {
            case 404:
                System.out.println("Page Not Found");
                break;
            case 500:
                System.out.println("Server Error");
                break;
            case 403:
                System.out.println("Forbidden");
                break;
            default:
                System.out.println("Unknown Error");
        }
    }
}

