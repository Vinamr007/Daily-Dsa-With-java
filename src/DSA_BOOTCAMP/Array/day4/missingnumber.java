package DSA_BOOTCAMP.Array.day4;

public class missingnumber {
    public static void main(String[] args) {
        int[] a={1,2,4,5,6};
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }

        int n=a.length+1;
        int actual=n*(n+1)/2;
        int missing=actual-sum;
        System.out.println(missing);
    }
}
