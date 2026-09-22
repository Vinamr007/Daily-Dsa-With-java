package DSA_BOOTCAMP.Array.Day20;

public class LargestAdjacentDifference {

    public static void main(String[] args) {

        int[] a = {2, 5, 1, 8, 3};

        int max = 0;

        for (int i = 0; i < a.length - 1; i++) {

            int diff = Math.abs(a[i] - a[i + 1]);

            if (diff > max) {
                max = diff;
            }
        }

        System.out.println(max);
    }
}
