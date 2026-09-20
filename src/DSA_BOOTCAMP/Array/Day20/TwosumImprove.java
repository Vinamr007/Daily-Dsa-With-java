package DSA_BOOTCAMP.Array.Day20;

import java.util.HashSet;

public class TwosumImprove {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {

            int required = target - num;

            if (set.contains(required)) {
                System.out.println("Pair: " + required + " + " + num);
                break;
            }

            set.add(num);
        }
    }
}
