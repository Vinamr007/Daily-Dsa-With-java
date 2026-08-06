package Qspider;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int principal = sc.nextInt();
        int rate = sc.nextInt();
        int time = sc.nextInt();
        System.out.println(principal * rate * time / 100);
    }
}
