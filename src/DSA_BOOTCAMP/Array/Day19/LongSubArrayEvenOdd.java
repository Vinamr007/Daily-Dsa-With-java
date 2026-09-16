package DSA_BOOTCAMP.Array.Day19;

public class LongSubArrayEvenOdd {

    public static void main(String[] args) {
        int[] a = {10, 15, 20, 25, 30, 40, 11};

        int count = 1;
        int maxCount = 1;

        for (int i = 1; i < a.length; i++) {

            // Check if even and odd are alternating
            if (a[i] % 2 != a[i - 1] % 2) {
                count++;
            } else {
                count = 1;
            }

            if (count > maxCount) {
                maxCount = count;
            }
        }

        System.out.println(maxCount);
    }
}
