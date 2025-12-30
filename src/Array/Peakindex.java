package Array;


public class Peakindex {
    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 7, 3, 2, 5};
        int result = findPeak(arr);
        System.out.println("Peak found at index: " + result);
    }

    public static int findPeak(int[] arr) {
        int st = 0;
        int end = arr.length - 1;

        while (st < end) {
            int mid = st + (end - st) / 2;

            if (arr[mid] < arr[mid + 1]) {
                // You are on the left slope, climbing UP.
                // The peak must be to the right.
                st = mid + 1;
            } else {
                // You are on the right slope, or at the peak.
                // The peak must be to the left (including mid).
                end = mid;
            }
        }
        // At the end, st == end pointing to a peak element.
        return st;
    }
}