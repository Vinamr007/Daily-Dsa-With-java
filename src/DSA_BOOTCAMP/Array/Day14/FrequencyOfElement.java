package DSA_BOOTCAMP.Array.Day14;

public class FrequencyOfElement {
    public static void main(String[] args) {

        int[] a = {1, 2, 2, 3, 1, 4, 2};

        boolean[] visited = new boolean[a.length];

        for (int i = 0; i < a.length; i++) {

            // Skip if this element is already counted
            if (visited[i]) {
                continue;
            }

            int count = 1;

            // Compare with remaining elements
            for (int j = i + 1; j < a.length; j++) {

                if (a[i] == a[j]) {
                    count++;

                    // Mark duplicate as visited
                    visited[j] = true;
                }
            }

            System.out.println(a[i] + " -> " + count);
        }
    }
}