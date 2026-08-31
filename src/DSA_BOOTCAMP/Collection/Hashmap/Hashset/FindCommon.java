package DSA_BOOTCAMP.Collection.Hashmap.Hashset;

import java.util.HashSet;

public class FindCommon {

    public static void FindCommon(int[] a,int[] b){
        HashSet<Integer> set=new HashSet<>();

        for(int x: a){
            set.add(x);
        }
        for(int x: b){
            if(set.contains(x)){
                System.out.println("duplicate:"+x);
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {3, 4, 5, 6, 7};
        FindCommon(a,b);
    }
}
