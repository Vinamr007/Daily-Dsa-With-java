package practice.Array;

public class peakindexinunsortedarray {
    public static int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // If mid is less than the next element,
            // the peak must be to the right
            if (nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            }
            // Otherwise, mid could be the peak or the peak is to the left
            else {
                right = mid;
            }
        }

        // left and right meet at the peak index
        return left;
    }
    public static void main(String[] args) {
      // peakindexinunsortedarray pf = new PeakFinder();
        int[] arr = {1, 2, 1, 3, 5, 6, 4};
        System.out.println("Peak index is: " + findPeakElement(arr));
    }
}
