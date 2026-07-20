package DSA_BOOTCAMP.Array.day11;

import java.util.Arrays;

public class LongestiveConsecutiveSequence {
    public static void main(String[] args) {
        int[] a={100, 4, 200, 1, 3, 2};

        if(a.length==0){
            System.out.println(0);
            return;
        }

        Arrays.sort(a);
        int count=1;
        int max=1;

        for(int i=1;i<a.length;i++){
            if(a[i]==a[i-1]){

            }
            else if(a[i]==a[i-1]+1){
                count++;
            }else{
                count=1;
            }
            if(count>max){
                max=count;
            }
        }

        System.out.println(max);
    }
}
