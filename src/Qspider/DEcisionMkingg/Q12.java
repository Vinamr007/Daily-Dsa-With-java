package Qspider.DEcisionMkingg;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bill = sc.nextInt();
        int discount = sc.nextInt();
        int gst = sc.nextInt();
        int afterDiscount = bill - (bill * discount / 100);
        System.out.println(afterDiscount + (afterDiscount * gst / 100));
    }
}
