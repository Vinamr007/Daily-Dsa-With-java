package DSA_BOOTCAMP.Collection.Hashmap.hashmap;

import java.util.HashMap;

public class MostFrequent {
    public static void main(String[] args) {

        int[] arr = {1, 3, 2, 3, 4, 3, 2, 1};

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int i = 0; i < arr.length; i++) {

            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        // Find maximum frequency
        int max = 0;
        int answer = 0;

        for (int i = 0; i < arr.length; i++) {

            if (map.get(arr[i]) > max) {
                max = map.get(arr[i]);
                answer = arr[i];
            }
        }

        System.out.println("Most frequent element: " + answer);
        System.out.println("Frequency: " + max);
    }
}
