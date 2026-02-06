package Hasing;

import java.util.HashSet;
import java.util.Set;

public class DistinctElement {
    public  static void countDistinct(int[] a){
        Set<Integer> s=new HashSet<>();
        for(int nums: a){
            s.add(nums);
        }
        System.out.println(s.size());
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,2,8,9,4};
//        int count=0;
//        for(int i=0;i<a.length;i++){
//            count++;
//        }
//        System.out.println(count);
        countDistinct(a);

    }
}
