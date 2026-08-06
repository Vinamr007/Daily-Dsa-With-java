package Qspider;

import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int first = sc.nextInt();
        int second = sc.nextInt();
        System.out.println(total * first / (first + second));
    }
}
