package DSA_BOOTCAMP.Array.Day18;

public class Maximum_Subarray_with_Equal_0s_and_1s {
    public static void main(String[] args) {
        int[] a={0, 1, 0};
        int maxlength=0;

        for(int i=0;i<a.length;i++){
            int zero=0;
            int one =0;

            for(int j=i;j <a.length;j++){
                if(a[j] ==0){
                    zero++;
                }else{
                    one++;
                }
                if(zero == one ){
                    int length=j-i+1;
                    if(length>maxlength){
                        maxlength=length;
                    }
                }
            }
        }
        System.out.println(maxlength);
    }
}
