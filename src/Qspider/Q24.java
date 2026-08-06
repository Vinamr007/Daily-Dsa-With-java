package Qspider;

import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int speed1 = sc.nextInt();
        int speed2 = sc.nextInt();
        System.out.println((2 * speed1 * speed2) / (speed1 + speed2));
    }
}
