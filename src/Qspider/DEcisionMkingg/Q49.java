package Qspider.DEcisionMkingg;

import java.util.Scanner;

public class Q49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int finalValue = sc.nextInt();
        int increase = sc.nextInt();
        System.out.println(finalValue * 100 / (100 + increase));
    }
}
