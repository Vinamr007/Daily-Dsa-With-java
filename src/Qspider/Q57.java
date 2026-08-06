package Qspider;

import java.util.Scanner;

public class Q57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int principal = sc.nextInt();
        int rate1 = sc.nextInt();
        int rate2 = sc.nextInt();
        int time = sc.nextInt();
        System.out.println(principal * (rate1 - rate2) * time / 100);
    }
}
