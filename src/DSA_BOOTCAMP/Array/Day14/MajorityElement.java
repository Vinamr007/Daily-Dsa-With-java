package DSA_BOOTCAMP.Array.Day14;

public class MajorityElement {
    public static void main(String[] args) {

        int[] a = {2, 2, 1, 1, 1, 2, 2};

        boolean found = false;

        for (int i = 0; i < a.length; i++) {

            int count = 0;

            // Count how many times a[i] appears
            for (int j = 0; j < a.length; j++) {

                if (a[i] == a[j]) {
                    count++;
                }
            }

            // Check if count is greater than n/2
            if (count > a.length / 2) {

                System.out.println("Majority Element = " + a[i]);

                found = true;
                break;
            }
        }

        // If no majority element exists
        if (!found) {
            System.out.println("No Majority Element");
        }
    }
}
