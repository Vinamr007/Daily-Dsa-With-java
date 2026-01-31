package Hasing;

import java.util.HashMap;

public class TWosum {
    public static void main(String[] args) {
        int[] a={5,2,6,1,4};
        int arr[]=new int[2];
        int target=7;
        HashMap<Integer , Integer> map=new HashMap<>();
for(int i=0;i<a.length;i++){

    Integer value=map.get(target - a[i]);

    if(value==null){
        map.put(a[i],i);
    }else {
        arr[0]=i;
        arr[1]=value;
    }
}

for(int nums: arr){
    System.out.print(nums+" ");
}
    }
}
