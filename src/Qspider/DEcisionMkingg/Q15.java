package Qspider.DEcisionMkingg;

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bill = sc.nextInt();
        int service = sc.nextInt();
        int friends = sc.nextInt();
        int total = bill + (bill * service / 100);
        System.out.println(total / friends);
    }
}
