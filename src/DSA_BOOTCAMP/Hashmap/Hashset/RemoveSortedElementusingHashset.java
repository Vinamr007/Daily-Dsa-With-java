package DSA_BOOTCAMP.Hashmap.Hashset;

import java.util.HashSet;

public class RemoveSortedElementusingHashset {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4};

        HashSet<Integer> set = new HashSet<Integer>();

        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }

        for(int a : set){
            System.out.print(a+ " ");
        }
    }
}
