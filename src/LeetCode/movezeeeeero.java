package LeetCode;

public class movezeeeeero {
    public static void main(String[] args) {

        int[] a = {0, 1, 0, 3, 12};

        int index = 0;

        // Step 1: Move all non-zero elements
        // to the beginning of the array
        for (int i = 0; i < a.length; i++) {

            if (a[i] != 0) {

                a[index] = a[i];
                index++;
            }
        }

        // Step 2: Put zeros in the remaining positions
        for (int i = index; i < a.length; i++) {

            a[i] = 0;
        }

        // Print the final array
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
