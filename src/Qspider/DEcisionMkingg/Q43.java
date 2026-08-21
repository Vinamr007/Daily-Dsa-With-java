package Qspider.DEcisionMkingg;

import java.util.Scanner;

public class Q43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hours = sc.nextInt();
        int minutes = sc.nextInt();
        System.out.println((hours * 60 + minutes) * 60);
    }
}
