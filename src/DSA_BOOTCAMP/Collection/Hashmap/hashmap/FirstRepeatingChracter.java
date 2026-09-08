package DSA_BOOTCAMP.Collection.Hashmap.hashmap;

import java.util.HashMap;

public class FirstRepeatingChracter {
    public static void main(String[] args) {
        int[] a={5, 3, 4, 3, 2, 5};

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<a.length;i++){
            if(map.containsKey(a[i])){

                System.out.println(a[i]);
                return ;
            }else{
                map.put(a[i], 1);
            }

        }
        System.out.println("No repeating element");
    }
}
