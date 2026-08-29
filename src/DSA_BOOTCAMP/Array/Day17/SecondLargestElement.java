package DSA_BOOTCAMP.Array.Day17;

import java.util.Arrays;

public class SecondLargestElement {
    public static void secondlargest(int[] a){
        Arrays.sort(a);
        int n=a[a.length-1];
        System.out.println("Second largest element is  "+n);

    }
    public static void main(String[] args) {
        int[] a={10, 5, 20, 8, 20, 15};
secondlargest(a);
    }
}
