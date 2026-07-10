package DSA_BOOTCAMP.Array.day9;

public class MaxDiifference {
    public static void main(String[] args) {
        int[] a = {2, 5, 1, 8, 4};
        int difference = 0;
        int max = 0;
        int min = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                max = a[i];
                min = a[i + 1];

            } else {
                max = a[i + 1];
                min = a[i ];

            }int diff = max - min;
            if (diff > difference) {
                difference = diff;

            }

        }
        System.out.println("max difference is: " + difference);

    }
}