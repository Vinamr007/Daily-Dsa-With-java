package DSA_BOOTCAMP.Array.day13;

public class MaximumLengthConsecutive {
    public static void main(String[] args) {
        int[] a={1,1,0,1,1,1};
        int count=0;
        int max=0;

        for(int i=0;i<a.length;i++){

            if(a[i]==1){
                count++;
            }else{
                count=0;
            }

            if(count>max){
                max=count;
            }
        }
        System.out.println(max);
    }
}
