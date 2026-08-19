package Qspider.advancedswitch;

import java.util.Scanner;

public class TrafficSignal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int state = sc.nextInt();

        switch (state) {
            case 1:
                System.out.println("Red - Stop");
                break;
            case 2:
                System.out.println("Green - Go");
                break;
            case 3:
                System.out.println("Yellow - Wait");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}

