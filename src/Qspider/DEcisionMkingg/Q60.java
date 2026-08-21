package Qspider.DEcisionMkingg;

import java.util.Scanner;

public class Q60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int volume = sc.nextInt();
        int loss = sc.nextInt();
        System.out.println(volume * (100 - loss) / 100);
    }
}
