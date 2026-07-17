package DSA_BOOTCAMP.Hashmap.Day1;

import java.util.HashMap;

public class CountWordOccurance {
    public static void main(String[] args) {
        String str="java is a java powerful java";


        String[] words=str.split(" ");

        HashMap<String, Integer> map=new HashMap<>();

        for(String word: words){
            if(map.containsKey(word)){
                map.put(word,map.get(word)+1);
            }else{
                map.put(word,1);
            }
        }

        for(String word: map.keySet()){
            System.out.println(word+" : "+map.get(word));
        }

    }
}
