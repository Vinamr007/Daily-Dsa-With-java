package practice.Array;

public class missnumber {
    public static void main(String[] args) {
        int[] arr= {3, 0, 1};
        int n=arr.length;
        int expectedsum=n*(n+1)/2;
        int actuallsum=0;
        for(int i=0;i<n;i++){
            actuallsum+=arr[i];
        }
        int misnumber=expectedsum-actuallsum;
        System.out.println(misnumber);

    }
}
