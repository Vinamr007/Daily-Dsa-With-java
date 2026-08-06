package Qspider;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int gst = sc.nextInt();
        System.out.println(price + (price * gst / 100));
    }
}
