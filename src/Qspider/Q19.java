package Qspider;

import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        int total = sc.nextInt();
        System.out.println(marks * 100 / total);
    }
}
