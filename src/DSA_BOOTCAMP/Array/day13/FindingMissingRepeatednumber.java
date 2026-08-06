package DSA_BOOTCAMP.Array.day13;

public class FindingMissingRepeatednumber {
    public static void main(String[] args) {
        int[] arr = {4, 3, 6, 2, 1, 1};

        int missing = -1;
        int repeating = -1;

        // Check every number from 1 to n
        for (int i = 1; i <= arr.length; i++) {

            int count = 0;

            // Count occurrences of i in the array
            for (int j = 0; j < arr.length; j++) {

                if (arr[j] == i) {
                    count++;
                }
            }

            // Number is missing
            if (count == 0) {
                missing = i;
            }

            // Number is repeated
            if (count > 1) {
                repeating = i;
            }
        }

        System.out.println("Missing Number = " + missing);
        System.out.println("Repeating Number = " + repeating);
    }
}
