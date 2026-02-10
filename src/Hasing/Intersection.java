package Hasing;

import java.util.HashSet;
import java.util.Set;

public class Intersection {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int[] b={3,4,5,6,7};
//        for(int i=0;i<a.length;i++){
//            for(int j=0;j<b.length;j++){
//                if(a[i]==b[j]){
//                    System.out.print(a[i]+" ");
//                }
//            }
  //      }

    Set<Integer> set=new HashSet<>();
    Set<Integer> intersection=new HashSet<>();

    for(int num :a ){
        set.add(num);
    }

    for(int num :b){
        if(set.contains(num)){
            intersection.add(num);
        }
    }


    for(int num :intersection){
        System.out.print(num+" ");
    }

    }
}
