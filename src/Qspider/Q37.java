package Qspider;

import java.util.Scanner;

public class Q37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(total * c / (a + b + c));
    }
}
