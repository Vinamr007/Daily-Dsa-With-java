package DSA_BOOTCAMP.Collection.Hashmap.Hashset;

import java.util.HashSet;

public class TwoSum {
    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15};
        int target = 9;

        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<arr.length;i++){
            int needed= target-arr[i];

            if(set.contains(needed)){
                System.out.println("true");
                return;
            }
            set.add(arr[i]);

        }

        System.out.println(false);
    }
}
