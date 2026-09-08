package DSA_BOOTCAMP.Collection.Hashmap.hashmap;

import java.util.HashMap;

public class HishestFrequency {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 2, 4, 2, 1, 3};

        HashMap<Integer, Integer> map= new HashMap<>();

        for(int i=0;i<a.length;i++){
            if(map.containsKey(a[i])){
                map.put(a[i],map.get(a[i])+1);

            }else{
                map.put(a[i], 1);
            }
        }
        int max=0;
        int answer=0;
        for(int i=0;i<a.length;i++){
            if (map.get(a[i]) > max) {
                max = map.get(a[i]);
                answer = a[i];
            }
        }
        System.out.println("Most frequent element: " + answer);
        System.out.println("max count: "+max);
    }
}
