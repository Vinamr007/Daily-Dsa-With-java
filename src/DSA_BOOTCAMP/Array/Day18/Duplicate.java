package DSA_BOOTCAMP.Array.Day18;

import java.util.HashSet;

public class Duplicate {
    public static void main(String[] args) {
        int[] a={1, 3, 4, 2, 2};
        HashSet<Integer> set= new  HashSet<Integer>();

        for(int i=0;i<a.length;i++){
            if(set.contains(a[i])){
                System.out.println(a[i]);
                return;
            }
            set.add(a[i]);
        }
    }
}
