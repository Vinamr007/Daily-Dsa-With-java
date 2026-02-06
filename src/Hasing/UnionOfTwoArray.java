package Hasing;

import java.util.HashSet;

public class UnionOfTwoArray {
    public static void union(int[] a, int[] b) {
        HashSet<Integer> set = new HashSet<>();

        for(int num : a) {
            set.add(num);

        }
        for(int num1 : b) {
            set.add(num1);
        }
        System.out.println(set.size());
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int[] b={3,4,5,6,7};
       union(a,b);
    }
}
