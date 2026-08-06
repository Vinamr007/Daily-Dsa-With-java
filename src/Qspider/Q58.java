package Qspider;

import java.util.Scanner;

public class Q58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalTime = sc.nextInt();
        int tasks = sc.nextInt();
        System.out.println(totalTime / tasks);
    }
}
