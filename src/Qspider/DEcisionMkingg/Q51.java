package Qspider.DEcisionMkingg;

import java.util.Scanner;

public class Q51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int width = sc.nextInt();
        int height = sc.nextInt();
        int rate = sc.nextInt();
        System.out.println(length * width * height * rate);
    }
}
