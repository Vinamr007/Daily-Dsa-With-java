package DSA_BOOTCAMP.day6;

import java.util.Arrays;

public class removeOddnumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] % 2 != 0){
                count++;
            }
        }
        int[] a=new int[count];
int index=0;
for(int i=0;i<arr.length;i++){
    if(arr[i]%2 != 0){
        a[index]=arr[i];
        index++;
    }
}
        System.out.println(Arrays.toString(a));
    }
}
