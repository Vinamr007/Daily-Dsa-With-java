package Qspider;

import java.util.Scanner;

public class Q41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int afterTax = sc.nextInt();
        int tax = sc.nextInt();
        System.out.println(afterTax * 100 / (100 + tax));
    }
}
