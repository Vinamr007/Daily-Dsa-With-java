package DSA_BOOTCAMP.Collection.Hashmap.Hashset;

import java.util.HashSet;

public class CheakArrayhasTwoElement {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
       int[] b = {4, 3, 2, 1};

        HashSet<Integer> set = new HashSet<>();

        for(int x: a){
            set.add(x);
        }
        HashSet<Integer> result= new HashSet<>();
        for(int x:b){
            if(!set.contains(x)){
                System.out.println("false");
                return;
            }
            result.add(x);
        }
        System.out.println("true");
    }
}
