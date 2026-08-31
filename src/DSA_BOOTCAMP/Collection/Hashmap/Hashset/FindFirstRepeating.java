package DSA_BOOTCAMP.Collection.Hashmap.Hashset;

import java.util.HashSet;

public class FindFirstRepeating {

    public static void Repeatingcharacter(int[] a) {
        HashSet<Integer> set = new HashSet<>();
        for (int x : a) {
            if (set.contains(x)) {
                System.out.println("First repeating number:" + x);
                return;
            }
            set.add(x);
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 3, 5, 2};
        Repeatingcharacter(arr);
    }

}
