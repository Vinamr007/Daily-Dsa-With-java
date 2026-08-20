package Qspider.DEcisionMkingg;

import java.util.Scanner;

public class Q35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int usd = sc.nextInt();
        int rate = sc.nextInt();
        int fee = sc.nextInt();
        int inr = usd * rate;
        System.out.println(inr + (inr * fee / 100));
    }
}
