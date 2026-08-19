package Qspider.advancedswitch;

import java.util.Scanner;

public class ExamPortal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Java\n2. Aptitude\n3. English");
        int section = sc.nextInt();

        switch (section) {
            case 1:
                System.out.println("Loading Java Questions");
                break;
            case 2:
                System.out.println("Loading Aptitude Questions");
                break;
            case 3:
                System.out.println("Loading English Questions");
                break;
            default:
                System.out.println("Invalid Section");
        }
    }
}

