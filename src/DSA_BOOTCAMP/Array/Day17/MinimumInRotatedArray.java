package DSA_BOOTCAMP.Array.Day17;

public class MinimumInRotatedArray {
    public static void main(String[] args) {

        int[] a = {4, 5, 6, 7, 0, 1, 2};

        int start = 0;
        int end = a.length - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;

            if (a[mid] > a[end]) {
                // Minimum is on the right side
                start = mid + 1;
            } else {
                // Minimum is on the left side or mid
                end = mid;
            }
        }

        System.out.println(a[start]);
    }
}
