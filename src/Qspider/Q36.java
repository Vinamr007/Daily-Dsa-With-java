package Qspider;

import java.util.Scanner;

public class Q36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsius = sc.nextDouble();
        double increase = sc.nextDouble();
        double fahrenheit = celsius * 9 / 5 + 32;
        System.out.println(fahrenheit + (fahrenheit * increase / 100));
    }
}
