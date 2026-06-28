package DSA_BOOTCAMP.day4;

import java.util.Arrays;

public class Rearrange_Positive_Negative {
    public static void main(String[] args) {
        int[] a={3, 1, -2, -5, 2, -4};
        int[] ans=new int[a.length];

        int positive=0;
        int negavtive=1;

        for(int i=0;i<a.length;i++){
            if(a[i]>0){
                ans[positive]=a[i];
                positive=positive+2;
            }else{
                ans[negavtive]=a[i];
                negavtive=negavtive+2;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
