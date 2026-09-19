package DSA_BOOTCAMP.Array.Day20;

public class MinimumDifference {
    public static void main(String[] args) {

        int[] a = {5, 3, 8, 1, 10};

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < a.length; i++) {

            for (int j = i + 1; j < a.length; j++) {

                int diff = Math.abs(a[i] - a[j]);

                if (diff < min) {
                    min = diff;
                }
            }
        }

        System.out.println(min);
    }

}
