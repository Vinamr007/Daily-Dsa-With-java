package DSA_BOOTCAMP.Array.Day19;

public class LongSubArrayWithSum {
    public static void main(String[] args) {
        int[] a={15, -2, 2, -8, 1, 7, 10, 23};
        int sum;
        int maxlength=0;
        for(int i=0;i<a.length;i++){

sum=0;
            for(int j=i;j<a.length;j++){

            sum+=a[j];
if(sum==0){
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
