package Qspider.DEcisionMkingg;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int slices = sc.nextInt();
        int friends = sc.nextInt();
        System.out.println(slices / friends);
        System.out.println(slices % friends);
    }
}
