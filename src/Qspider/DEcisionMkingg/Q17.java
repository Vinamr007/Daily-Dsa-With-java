package Qspider.DEcisionMkingg;

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int perKm = sc.nextInt();
        int distance = sc.nextInt();
        System.out.println(base + perKm * distance);
    }
}
