package DSA_BOOTCAMP.Collection.Hashmap.Hashset;

import java.util.HashSet;

public class FindDuplicateElement {
    public static void PrintDuplicate(int[] arr){
        HashSet<Integer> set = new HashSet<>();

        for(int x: arr){
            if(set.contains(x)){
                System.out.println("duplicate:"+x);
            }
            set.add(x);
        }

    }


    public static void removeDuplicate(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int x : arr){
            set.add(x);
        }
        for(int x :set){
            System.out.print(x+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 20, 40, 10};
      //  PrintDuplicate(arr);
        removeDuplicate(arr);
    }
}
