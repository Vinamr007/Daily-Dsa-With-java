package DSA_BOOTCAMP;

import java.util.Arrays;

public class timepasMain {
    public static void main(String[] args) {
       int a=17;
       int b=18;
       int c=45;
       int d=1;


       int e=++a + b++ - c-- - -d++ + a-- - b++ + c + --b + d++ - b + d-- + c++ - --c + d++ + --c - --d;
        System.out.println(e);
    }
}
