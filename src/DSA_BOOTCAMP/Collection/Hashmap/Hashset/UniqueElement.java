package DSA_BOOTCAMP.Collection.Hashmap.Hashset;

import java.util.HashSet;

public class UniqueElement {
    public static void main(String[] args) {
        int[] a={1, 2, 3, 2, 4, 1, 5};

    HashSet<Integer> set = new HashSet<>();

    for(int x: a){
//        if(set.contains(x)){
//
//        }
        set.add(x);

    }
        System.out.print(set+" ");
    }
}
