package LeetCode;

import java.util.HashSet;

public class InsertionOfTwosortedArray {
    public static int[] intersection(int[] a, int[] b) {

        HashSet<Integer> set= new HashSet<>();
        HashSet<Integer> resultSet= new HashSet<>();

        for(int x: a){
            set.add(x);
        }

        for(int x: b){
            if(set.contains(x)){
                resultSet.add(x);
            }
        }

        int[] result= new int[resultSet.size()];

        int i=0;
        for(int x: resultSet){
            result[i]=x;
            i++;
        }
        for(int x: result){
            System.out.print(x+" ");
        }
        return result;
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {3, 4, 5, 6, 7};
        intersection(a,b);
    }
}
