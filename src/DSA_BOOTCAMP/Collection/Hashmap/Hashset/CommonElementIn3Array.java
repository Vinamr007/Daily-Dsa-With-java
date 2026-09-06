package DSA_BOOTCAMP.Collection.Hashmap.Hashset;

import java.util.HashSet;

public class CommonElementIn3Array {
    public static void main(String[] args) {
        int[] a = {1, 5, 10, 20, 40, 80};
        int[] b = {6, 7, 20, 80, 100};
        int[] c = {3, 4, 15, 20, 30, 70, 80, 120};

        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> setB = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        // Add first array
        for (int num : a) {
            setA.add(num);
        }

        // Find common between a and b
        for (int num : b) {
            if (setA.contains(num)) {
                setB.add(num);
            }
        }

        // Find common between a, b and c
        for (int num : c) {
            if (setB.contains(num)) {
                result.add(num);
            }
        }

        System.out.println(result);

    }
}
