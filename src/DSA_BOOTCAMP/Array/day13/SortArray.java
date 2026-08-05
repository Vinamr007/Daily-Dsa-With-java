package DSA_BOOTCAMP.Array.day13;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] a = {2, 0, 2, 1, 1, 0};

        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}