package Qspider.advancedswitch;

import java.util.Scanner;

public class FileOps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1.Copy 2.Delete 3.Rename");
        int op = sc.nextInt();

        switch (op) {
            case 1:
                System.out.println("File Copied");
                break;
            case 2:
                System.out.println("File Deleted");
                break;
            case 3:
                System.out.println("File Renamed");
                break;
            default:
                System.out.println("Invalid operation");
        }
    }
}

