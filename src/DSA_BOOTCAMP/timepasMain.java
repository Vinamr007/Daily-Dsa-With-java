package DSA_BOOTCAMP;

import java.util.Arrays;

public class timepasMain {
    public static void main(String[] args) {
        int[] a={1,2,3,4};
        int[] ans=new int[a.length];

        for(int i =0;i<a.length;i++){
            int product=1;
            for(int j=0;j<a.length;j++){
                if(i!=j){
                    product=product*a[j];

                }
            }
            ans[i]=product;
        }
        System.out.println(Arrays.toString(ans));
    }
}
