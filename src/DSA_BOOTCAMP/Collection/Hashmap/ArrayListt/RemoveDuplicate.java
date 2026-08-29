package DSA_BOOTCAMP.Collection.Hashmap.ArrayListt;

import java.util.ArrayList;

public class RemoveDuplicate {

    public static ArrayList<Integer> removeDuplicates(int[] arr){
        ArrayList<Integer> list= new ArrayList<>();

        for(int i=0;i<arr.length;i++){

            if(!list.contains(arr[i])){
                list.add(arr[i]);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[] arr={10,20,10,30,20,40};

        ArrayList<Integer> list= removeDuplicates(arr);
        System.out.println(list);
    }
}
