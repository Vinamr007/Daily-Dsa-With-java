package DSA_BOOTCAMP.Collection.Hashmap.Hashset;

import java.util.HashSet;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int n = 6;

        HashSet<Integer> set = new HashSet<>();

        // Put all array elements into HashSet
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        // Check numbers from 1 to n
        for (int i = 1; i <= n; i++) {

            if (!set.contains(i)) {
                System.out.println("Missing number: " + i);
                break;
            }
        }
    }
}
