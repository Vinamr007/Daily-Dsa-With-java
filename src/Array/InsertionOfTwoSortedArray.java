package Array;

import java.util.ArrayList;

public class InsertionOfTwoSortedArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 4, 5};
        int[] b = {2, 2, 3, 5, 6};

        ArrayList<Integer> result = new ArrayList<>();

        int i = 0, j = 0;

        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                // Avoid duplicates
                if (result.isEmpty() || result.get(result.size() - 1) != a[i]) {
                    result.add(a[i]);
                }
                i++;
                j++;
            } else if (a[i] < b[j]) {
                i++;
            } else {
                j++;
            }
        }

        System.out.println(result);
    }
}