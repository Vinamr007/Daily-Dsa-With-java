package DSA_BOOTCAMP.Array.day8;

public class max_product {
    public static void main(String[] args) {
        int[] a={5,2,8,1,9};
        int sum=0;
        int maxsum=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                sum=a[i]*a[j];
            }
            if(sum>maxsum){
                maxsum=sum;
            }

        }
        System.out.println(maxsum);
    }
}
