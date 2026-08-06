package Qspider;

import java.util.Scanner;

public class Q46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int expenses = sc.nextInt();
        int savings = income - expenses;
        System.out.println(savings + " " + (savings * 12));
    }
}
