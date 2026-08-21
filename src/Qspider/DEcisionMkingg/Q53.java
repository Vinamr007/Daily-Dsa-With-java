package Qspider.DEcisionMkingg;

import java.util.Scanner;

public class Q53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int area = sc.nextInt();
        int cover = sc.nextInt();
        System.out.println((area + cover - 1) / cover);
    }
}
