package Qspider.advancedswitch;

import java.util.Scanner;

public class SmartHome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Living Room\n2. Bedroom");
        int room = sc.nextInt();

        System.out.println("1. Light\n2. Fan");
        int device = sc.nextInt();

        System.out.println("1. ON\n2. OFF");
        int action = sc.nextInt();

        switch (room) {
            case 1:
                switch (device) {
                    case 1:
                        if (action == 1) {
                            System.out.println("Living Light ON");
                        } else if (action == 2) {
                            System.out.println("Living Light OFF");
                        } else {
                            System.out.println("Invalid action");
                        }
                        break;
                    case 2:
                        if (action == 1) {
                            System.out.println("Living Fan ON");
                        } else if (action == 2) {
                            System.out.println("Living Fan OFF");
                        } else {
                            System.out.println("Invalid action");
                        }
                        break;
                    default:
                        System.out.println("Invalid device");
                }
                break;
            case 2:
                switch (device) {
                    case 1:
                        if (action == 1) {
                            System.out.println("Bedroom Light ON");
                        } else if (action == 2) {
                            System.out.println("Bedroom Light OFF");
                        } else {
                            System.out.println("Invalid action");
                        }
                        break;
                    case 2:
                        if (action == 1) {
                            System.out.println("Bedroom Fan ON");
                        } else if (action == 2) {
                            System.out.println("Bedroom Fan OFF");
                        } else {
                            System.out.println("Invalid action");
                        }
                        break;
                    default:
                        System.out.println("Invalid device");
                }
                break;
            default:
                System.out.println("Invalid room");
        }
    }
}

