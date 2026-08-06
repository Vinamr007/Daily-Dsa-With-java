package Qspider;

import java.util.Scanner;

public class Q56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks1 = sc.nextInt();
        int weight1 = sc.nextInt();
        int marks2 = sc.nextInt();
        int weight2 = sc.nextInt();
        System.out.println((marks1 * weight1 + marks2 * weight2) / (weight1 + weight2));
    }
}
