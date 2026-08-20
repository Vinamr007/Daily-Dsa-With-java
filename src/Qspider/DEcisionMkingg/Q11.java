package Qspider.DEcisionMkingg;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        int bonus = sc.nextInt();
        int tax = sc.nextInt();
        int total = salary + bonus;
        System.out.println(total - (total * tax / 100));
    }
}
