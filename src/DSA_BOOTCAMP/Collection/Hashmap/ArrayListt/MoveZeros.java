package DSA_BOOTCAMP.Collection.Hashmap.ArrayListt;

import java.util.ArrayList;

public class MoveZeros {

    public static ArrayList<Integer> moveZeros(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                list.add(arr[i]);
            }
        }
        for(int i=0;i<arr.length - list.size();i++){
            list.add(0);
        }


        return list;
    }

    public static void main(String[] args) {
        int[] arr={0, 1, 0, 3, 12};
moveZeros(arr);
    }
}
