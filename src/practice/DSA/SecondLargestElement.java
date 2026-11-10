package practice.DSA;

import java.util.Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {

        int[] arr = {10, 5, 20, 8, 15};

        Arrays.sort(arr);
        System.out.println(arr[arr.length-2]);
    }
}
